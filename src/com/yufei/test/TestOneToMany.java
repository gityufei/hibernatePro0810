package com.yufei.test;

import com.yufei.bean.Department;
import com.yufei.bean.Employee;
import com.yufei.util.HtUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Set;

public class TestOneToMany {
    @Test
    public void testAdd() {
        Department d1 = new Department();
        d1.setAddress("广州");
        d1.setDepartName("技术部");
        Employee e1 = new Employee();
        e1.setJob("高级工程师");
        e1.setJoinTime(new Date());
        e1.setName("ww");
        e1.setSalary(10000f);
//        添加部门和员工的关系
        d1.getEmps().add(e1);
        Session session = HtUtil.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(e1);
        session.save(d1);
        tx.commit();
    }

    @Test
    public void query1(){
        Session session = HtUtil.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Department depart = session.get(Department.class, 1);
        System.out.println(depart);
        Set<Employee> emps = depart.getEmps();
        for (Employee emp : emps) {
            System.out.println(emp.getJob()+emp.getName());
        }
    }

    @Test
    public void query2(){
        Session session = HtUtil.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Employee employee = session.get(Employee.class, 1);
        System.out.println(employee);
        tx.commit();
    }
}