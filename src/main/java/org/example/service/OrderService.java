package org.example.service;

import org.example.model.Order;
import org.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private AuthService authService;

    /**
     * 创建订单。
     *
     * 该方法用于创建一个新的订单。在创建订单之前，会通过认证服务验证用户的身份。
     * 如果认证失败，则抛出运行时异常；如果认证成功，则将订单保存到数据库中。
     *
     * @param order 订单对象，包含订单的详细信息。
     * @param token 用户的身份认证令牌，用于验证用户权限。
     *
     * @throws RuntimeException 如果认证失败，则抛出此异常。
     */
    public void createOrder(Order order, String token) {
        // 验证用户身份，确保操作的合法性
        if (!authService.authenticate(token)) {
            throw new RuntimeException("认证失败");
        }

        // 将订单保存到数据库中
        orderRepo.save(order);
    }
}

