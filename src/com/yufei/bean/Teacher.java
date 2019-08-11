package com.yufei.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Teacher implements Serializable {
	private static final long serialVersionUID = -2011627141549023809L;
	private Integer id;
	private String name;
	private Set<Student> stus = new HashSet<>();

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

	public Set<Student> getStus() {
		return stus;
	}

	public void setStus(Set<Student> stus) {
		this.stus = stus;
	}

}
