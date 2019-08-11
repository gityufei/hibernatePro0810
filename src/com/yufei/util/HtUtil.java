package com.yufei.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HtUtil {
    private static Configuration configuration;
    private static SessionFactory sessionFactory;

    static{
        configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    /**
     * 获取session对象
     * @return Session对象
     */
    public static Session openSession(){
        return sessionFactory.openSession();
    }

    /**
     * 使用数据源连接池获取session对象
     * @return
     */
    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
