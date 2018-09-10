package com.dfby.component;

/**
 * @program: Springday04
 * @Date: 2018/9/6 16:22
 * @Author: Mr.Zhang
 * @Description:
 */
public class ProductImpl implements Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(String message) {
        System.out.println(message+name);
    }

    public void print() {
        System.out.println("print()");
    }
}
