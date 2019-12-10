package com.demo.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String name;
    private String sex;

    public String getsex() {
        return sex;
    }

    public void setsex(String sex) {
        this.sex = sex;
    }

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
        this.name = name == null ? null : name.trim();
    }
}

