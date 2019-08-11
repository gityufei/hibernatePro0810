package com.yufei.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Student implements Serializable {
	private static final long serialVersionUID = 5435796913331317899L;
	private Integer id;
	private String name;
	private Set<Teacher> teas = new HashSet<>();

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

	public Set<Teacher> getTeas() {
		return teas;
	}

	public void setTeas(Set<Teacher> teas) {
		this.teas = teas;
	}

}
