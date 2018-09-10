package com.dfby.aop.component;

import com.dfby.aop.entity.Entity;

import java.util.List;

/**
 * @program: Springday04
 * @Date: 2018/9/7 15:38
 * @Author: Mr.Zhang
 * @Description:
 */
public class EntityDaoImpl implements EntityDao {
    public int insert(Entity entity) {
        System.out.println("增加");
        return 0;
    }

    public int delete(Entity entity) {
        System.out.println("删除");
        return 0;
    }

    public int update(Entity entity) {
        System.out.println("修改");
        return 0;
    }

    public List<Entity> query() {
        System.out.println("查询");
        return null;
    }
}
