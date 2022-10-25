package com.cogent.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_tbl")
public class Customercare {
	@Id
	@Column
	private int id;
	@Column
	private String complaintDesc;
	@Column
	private int userId;
	@Column
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComplaintDesc() {
		return complaintDesc;
	}
	public void setComplaintDesc(String complaintDesc) {
		this.complaintDesc = complaintDesc;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customercare(int id, String complaintDesc, int userId, String status) {
		super();
		this.id = id;
		this.complaintDesc = complaintDesc;
		this.userId = userId;
		this.status = status;
	}
	public Customercare() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customercare [id=" + id + ", complaintDesc=" + complaintDesc + ", userId=" + userId + ", status="
				+ status + "]";
	}
	
	
}
