package com.github.hellospringmvc.entity;

import javax.persistence.*;

/**
 * @author Bill
 * @version 2012-12-21
 */
@Entity
@Table(name = "test_user")
public class User {

    @Id
//    @GeneratedValue(generator = "generator")    // for MySQL
//    @GenericGenerator(name = "generator", strategy = "native")    // for MySQL
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)     // for Postgres
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "generator", sequenceName = "user_seq")    // for Postgres
    private Long id;

    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
