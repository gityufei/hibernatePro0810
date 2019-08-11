package com.yufei.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import com.yufei.bean.Student;
import com.yufei.bean.Teacher;
import com.yufei.util.HtUtil;

public class TestManytoMany {


	/**
	 * 一对多，多对一表间关系维护：
	 * 由mapper指定谁维护对应外键（表间关系）
	 *   只有指定者在set集合添加对应元素时才能维护表间关系
     *         故在一对多，多对一中 由一的一方维护表间关系（只有一的一方有set集合，用来存放多）
	 * 多对多表间关系维护：
	 * 注：在mapper中配置由谁维护外键，表间关系由谁在add()时维护 表间关系的维护：有对象在添加对应set集合属性时维护
	 * 此例中：表间关系有Student维护，故在Student add（Teacher）才会生成对应的中间表（表间关系）
	 * 故在Teacher.add时，不会生成中间表(表间关系)
	 */
	@Test
	public void add() {
		Teacher t1 = new Teacher();
		t1.setName("张老师");
		Teacher t2 = new Teacher();
		t2.setName("李老师");
		Teacher t3 = new Teacher();
		t3.setName("王老师");

		Student s1 = new Student();
		s1.setName("张三");
		Student s2 = new Student();
		s2.setName("李四");
		Student s3 = new Student();
		s3.setName("王五");

		// t1.getStus().add(s1);
		// t1.getStus().add(s2);
		// t2.getStus().add(s2);
		// t2.getStus().add(s3);
		// t3.getStus().add(s1);

		// 注：在mapper中配置由谁维护外键，表间关系由谁在add()时维护
		// 表间关系的维护：有对象在添加对应set集合属性时维护
		// 此例中：表间关系有Student维护，故在Student add（Teacher）才会生成对应的中间表（表间关系）
		// 故在Teacher.add时，不会生成中间表(表间关系)
		s1.getTeas().add(t1);
		s1.getTeas().add(t3);
		s2.getTeas().add(t1);
		s2.getTeas().add(t2);
		s3.getTeas().add(t2);

		Session session = HtUtil.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		tx.commit();

	}

}
