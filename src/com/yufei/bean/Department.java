package com.yufei.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 部门实体类
 * @author 姚臣伟
 */
public class Department implements Serializable {
    private static final long serialVersionUID = -2705306283405219965L;
    private Integer id; // 编号
    private String departName; // 名称
    private String address; // 所在地
    private Set<Employee> emps = new HashSet<>(); // 一对多的引用

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Employee> getEmps() {
        return emps;
    }

    public void setEmps(Set<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departName='" + departName + '\'' +
                ", address='" + address + '\'' +
                ", emps=" + emps +
                '}';
    }
}

