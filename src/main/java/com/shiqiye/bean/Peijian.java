package com.shiqiye.bean;

public class Peijian {
	@Override
	public String toString() {
		return "Peijian [id=" + id + ", peijian_name=" + peijian_name + ", peijian_id=" + peijian_id + "]";
	}
	private Integer id;
	private String peijian_name;
	private String peijian_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPeijian_name() {
		return peijian_name;
	}
	public void setPeijian_name(String peijian_name) {
		this.peijian_name = peijian_name;
	}
	public String getPeijian_id() {
		return peijian_id;
	}
	public void setPeijian_id(String peijian_id) {
		this.peijian_id = peijian_id;
	}
	
	
}
