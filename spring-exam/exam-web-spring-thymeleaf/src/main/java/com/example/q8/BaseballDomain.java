package com.example.q8;

import java.util.Date;

public class BaseballDomain {
	private Integer id;
	private String name;
	private Date establishedDate;
	private String studiumName;
	public BaseballDomain() {}
	
	public BaseballDomain(Integer id, String name, Date establishedDate, String studiumName) {
		super();
		this.id = id;
		this.name = name;
		this.establishedDate = establishedDate;
		this.studiumName = studiumName;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getStudiumName() {
		return studiumName;
	}

	public void setStudiumName(String studiumName) {
		this.studiumName = studiumName;
	}

	
}
