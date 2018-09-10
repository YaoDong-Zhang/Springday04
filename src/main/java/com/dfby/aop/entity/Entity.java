package com.dfby.aop.entity;

/**
 * @program: Springday04
 * @Date: 2018/9/7 15:34
 * @Author: Mr.Zhang
 * @Description:
 */
public class Entity {
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Entity() {
    }

    public Entity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
