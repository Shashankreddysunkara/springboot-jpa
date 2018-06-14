package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by barath on 08/06/18.
 */
@Entity
@Table(name="USER")
public class User implements Serializable {

    @Id
    @Column(name="USER_ID")
    private String userId;

    @Column(name="USER_NAME")
    private String userName;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User() {
    }
}
