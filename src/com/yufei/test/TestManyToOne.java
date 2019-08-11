package com.yufei.test;

import com.yufei.bean.Department;
import com.yufei.bean.Employee;
import com.yufei.util.HtUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * 多对一单向关联
 */
public class TestManyToOne {
    private static Session session;
    private static Transaction tx;
    static{
        session = HtUtil.getCurrentSession();
        tx = session.beginTransaction();
    }

    @Test
    public void add(){
        Department d1 = new Department();
        d1.setAddress("深圳");
        d1.setDepartName("技术部");

        Employee e1 = new Employee();
        e1.setJob("高级工程师");
        e1.setJoinTime(new Date());
        e1.setName("张三");
        e1.setSalary(6000f);
        // 添加部门和员工的关系
        d1.getEmps().add(e1);
        session.save(e1);
        session.save(d1);

        tx.commit();
    }
//    从部门到员工
    @Test
    public void testQuery(){

        //查询id为1的员工
        Employee employeee = session.get(Employee.class, 1);

        System.out.println(employeee);
    }

    @Test
    public void testQuery1(){


        Employee emp = session.get(Employee.class, 1);
        System.out.println(emp.getDepart().getAddress()+emp.getDepart().getDepartName()+emp.getName()+emp.getJob());
    }








}
