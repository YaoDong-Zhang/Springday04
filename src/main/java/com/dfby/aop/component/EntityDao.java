package com.dfby.aop.component;

import com.dfby.aop.entity.Entity;

import java.util.List;

/**
 * @program: Springday04
 * @Date: 2018/9/7 15:35
 * @Author: Mr.Zhang
 * @Description:
 */
public interface EntityDao {
    int insert(Entity entity);
    int delete(Entity entity);
    int update(Entity entity);
    List<Entity> query();
}
