package com.vochidai.WebTaxi.model;

import java.util.Date;

public class Category {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.category_id
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	private Byte categoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.name
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.last_update
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	private Date lastUpdate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.category_id
	 * @return  the value of category.category_id
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	public Byte getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.category_id
	 * @param categoryId  the value for category.category_id
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	public void setCategoryId(Byte categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.name
	 * @return  the value of category.name
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.name
	 * @param name  the value for category.name
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.last_update
	 * @return  the value of category.last_update
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.last_update
	 * @param lastUpdate  the value for category.last_update
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}