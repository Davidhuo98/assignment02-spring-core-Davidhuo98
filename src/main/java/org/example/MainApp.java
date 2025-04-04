/**
 * MainApp 类是应用程序的入口点。
 * 它通过 Spring 框架加载配置并演示 OrderController 的正常流程和异常流程。
 */
package org.example;

import org.example.config.AppConfig;
import org.example.controller.OrderController;
import org.example.model.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    /**
     * main 方法是程序的入口点。
     * 
     * @param args 命令行参数，当前未使用。
     * 
     * 该方法执行以下操作：
     * 1. 使用 Spring 的 AnnotationConfigApplicationContext 加载应用程序配置。
     * 2. 获取 OrderController 的实例。
     * 3. 创建一个 Order 对象用于测试。
     * 4. 演示正常流程和异常流程的订单处理，并捕获可能的异常。
     */
    public static void main(String[] args) {
        // 加载 Spring 应用上下文
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // 从应用上下文中获取 OrderController 实例
        OrderController controller = ctx.getBean(OrderController.class);

        // 创建一个测试订单对象
        Order order = new Order("123", "笔记本电脑", 8999.0);

        try {
            // 正常流程：使用有效的 token 处理订单
            controller.processOrder(order, "valid_token");

            // 异常流程：使用无效的 token 处理订单，预期会抛出异常
            controller.processOrder(order, "invalid_token");
        } catch (Exception e) {
            // 捕获并打印异常信息
            System.out.println("捕获到异常：" + e.getMessage());
        }
    }
}
