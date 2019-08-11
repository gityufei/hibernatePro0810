package com.yufei.bean;
import java.io.Serializable;
import java.util.Date;

/**
 * 员工实体类
 * @author 姚臣伟
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -2686507235309382491L;
    private Integer id; // 编号
    private String name; // 姓名
    private Date joinTime; // 入职时间
    private String job; // 职位
    private float salary; // 月薪
    private Department depart; // 多对一的引用

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

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Department getDepart() {
        return depart;
    }

    public void setDepart(Department depart) {
        this.depart = depart;
    }
}

