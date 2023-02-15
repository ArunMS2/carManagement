package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carDetails")
public class car {
	
	@Id
	private int id;
	private String name;
	private String owner;
	private int mf_year;
	private String color;
	private String category ;
	private String f_Type;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getF_Type() {
		return f_Type;
	}
	public void setF_Type(String f_Type) {
		this.f_Type = f_Type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getMf_year() {
		return mf_year;
	}
	public void setMf_year(int mf_year) {
		this.mf_year = mf_year;
	}
	public car(int id, String name, String owner, int mf_year, String color, String category, String f_Type) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.mf_year = mf_year;
		this.color = color;
		this.category = category;
		this.f_Type = f_Type;
	}
	@Override
	public String toString() {
		return "car [id=" + id + ", name=" + name + ", owner=" + owner + ", mf_year=" + mf_year + ", color=" + color
				+ ", category=" + category + ", f_Type=" + f_Type + "]";
	}
	
	public car()
	{
		
	}
	

}