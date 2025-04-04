package org.example.repository;

import org.example.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save(Order order) {
        System.out.println("保存订单到数据库：" + order.getProduct());
    }
}