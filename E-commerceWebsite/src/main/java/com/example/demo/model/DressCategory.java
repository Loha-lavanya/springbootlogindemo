package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="table_category")

public class DressCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
	
	
	@Column(name="category_name")
	private String categoryName;
	

@OneToMany(cascade=CascadeType.ALL,mappedBy="category") //category is objrct of cateogry in dress class
private List<Dress> dress;

	
	
	
	
}
