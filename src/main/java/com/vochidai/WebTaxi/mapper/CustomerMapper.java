package com.vochidai.WebTaxi.mapper;

import com.vochidai.WebTaxi.model.Customer;
import com.vochidai.WebTaxi.model.CustomerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	long countByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int deleteByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int deleteByPrimaryKey(Integer customerId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int insertCustomer(Customer row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int insertSelective(Customer row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	List<Customer> selectByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	Customer selectByPrimaryKey(Integer customerId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int updateByExampleSelective(@Param("row") Customer row, @Param("example") CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int updateByExample(@Param("row") Customer row, @Param("example") CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int updateByPrimaryKeySelective(Customer row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int updateByPrimaryKey(Customer row);
}