package org.example.controller;

import org.example.model.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController 是一个 REST 控制器，用于处理与订单相关的请求。
 * 它依赖于 OrderService 来执行具体的业务逻辑。
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 处理订单的创建逻辑。
     *
     * @param order 订单对象，包含订单的详细信息（如商品、数量、用户信息等）。
     *              不能为空，且应符合业务规则。
     * @param token 用户的身份验证令牌，用于验证用户权限和身份。
     *              不能为空，且应为有效的身份验证令牌。
     *
     * 此方法调用 OrderService 的 createOrder 方法来完成订单的创建。
     */
    public void processOrder(Order order, String token) {
        // 调用 OrderService 的 createOrder 方法，将订单和身份验证令牌传递给服务层处理。
        orderService.createOrder(order, token);
    }
}

