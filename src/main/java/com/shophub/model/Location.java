package com.shophub.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Location {
	private String branch;
	private String drawerName;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDrawerName() {
		return drawerName;
	}
	public void setDrawerName(String drawerName) {
		this.drawerName = drawerName;
	}
	public Location(String branch, String drawerName) {
		super();
		this.branch = branch;
		this.drawerName = drawerName;
	}
	public Location() {
		super();
	}



}
