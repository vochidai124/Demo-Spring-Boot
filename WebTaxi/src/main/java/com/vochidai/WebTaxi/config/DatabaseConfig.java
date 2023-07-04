package com.vochidai.WebTaxi.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {
	
	@Value("${test.datasource.driverClassName}")
	private String driverClassNameDB;
	
	@Value("${test.datasource.url}")
	private String urlDB;
	
	@Value("${test.datasource.username}")
	private String userNameDB;
	
	@Value("${test.datasource.password}")
	private String passWordDB;
	
	private String secretKey = "Hello12@";
	
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName(driverClassNameDB);
		hikariConfig.setJdbcUrl(AESConfig.decrypt(urlDB, secretKey));
		hikariConfig.setUsername(AESConfig.decrypt(userNameDB, secretKey));
		hikariConfig.setPassword(AESConfig.decrypt(passWordDB, secretKey));
		
		HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
		
		return hikariDataSource;
	}
	
	@Bean(name = "transactionManager")
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/com/vochidai/WebTaxi/mapper/sql/*.xml"));
		
		return sqlSessionFactoryBean.getObject();
		
	}
	
}
