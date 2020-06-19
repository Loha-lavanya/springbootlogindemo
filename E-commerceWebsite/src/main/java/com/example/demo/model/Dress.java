package com.example.demo.model;

import java.math.BigDecimal;
import java.sql.Date;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="table_items")

public class Dress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;

private String description;

private String colour;
//@coloumn is nedded when database name and member names are different
@Column(name="unit_price")  
private BigDecimal unitPrice;

@Column(name="image_url")
private String imageUrl;

private boolean active;
private int size;

@Column(name="units_in_stock")
private int unitsInStack;

@Column(name="date_created")
private Date createdOn;

@Column(name="last_updated")
private Date updatedOn;



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

@Override
public String toString() {
	return "Dress [id=" + id + ", name=" + name + ", description=" + description + ", unitPrice=" + unitPrice
			+ ", imageUrl=" + imageUrl + ", active=" + active + ", unitsInStack=" + unitsInStack + ", createdOn="
			+ createdOn + ", updatedOn=" + updatedOn + "]";
}

public void setDescription(String description) {
	this.description = description;
}

public BigDecimal getUnitPrice() {
	return unitPrice;
}

public void setUnitPrice(BigDecimal unitPrice) {
	this.unitPrice = unitPrice;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}

public boolean isActive() {
	return active;
}

public void setActive(boolean active) {
	this.active = active;
}


public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public int getUnitsInStack() {
	return unitsInStack;
}

public void setUnitsInStack(int unitsInStack) {
	this.unitsInStack = unitsInStack;
}

public Date getCreatedOn() {
	return createdOn;
}

public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
}

public Date getUpdatedOn() {
	return updatedOn;
}

public void setUpdatedOn(Date updatedOn) {
	this.updatedOn = updatedOn;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}



@ManyToOne
@JoinColumn(name="category_id",nullable=false)
private DressCategory category;








}
