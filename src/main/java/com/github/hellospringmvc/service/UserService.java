package com.github.hellospringmvc.service;

import com.github.hellospringmvc.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Bill
 * @version 2012-12-21
 */
@Service
public class UserService {

    @Resource
    private SessionFactory sessionFactory;

    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select u from User u").list();
    }

}
