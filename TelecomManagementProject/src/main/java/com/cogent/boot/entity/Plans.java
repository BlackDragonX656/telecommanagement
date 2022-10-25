package com.cogent.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plans_tbl")
public class Plans {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private double cost;
	@Column
	private boolean validity;
	
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public boolean isValidity() {
		return validity;
	}
	public void setValidity(boolean validity) {
		this.validity = validity;
	}
	public Plans(int id, String name, double cost, boolean validity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.validity = validity;
	}
	public Plans() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Plans [id=" + id + ", name=" + name + ", cost=" + cost + ", validity=" + validity + "]";
	}
	
	
}
