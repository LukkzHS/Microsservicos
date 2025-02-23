package com.iftm.startexample.model.dto;

import java.io.Serializable;

import com.iftm.startexample.model.Address;
import com.iftm.startexample.model.User;

import lombok.Data;

@Data
public class UserDTO implements Serializable {
    private String id;
    private String name;
    private int age;
    private Address address;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.id = user.getId().toString();
        this.name = user.getName();
        this.age = user.getAge();
        this.address = user.getAddress();
    }

    public UserDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

}


