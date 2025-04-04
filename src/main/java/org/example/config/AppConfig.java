package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AppConfig 是一个 Spring 配置类，用于定义应用程序的上下文配置。
 *
 * <p>该类通过以下注解实现配置功能：
 * <ul>
 *   <li>{@code @Configuration}：标记该类为 Spring 的配置类，类似于 XML 配置文件。</li>
 *   <li>{@code @ComponentScan}：启用组件扫描，自动发现并注册 Spring 容器中的 Bean。
 *       指定的基础包为 {@code "org.example"}。</li>
 *   <li>{@code @EnableAspectJAutoProxy}：启用 AspectJ 的自动代理功能，支持 AOP（面向切面编程）。</li>
 * </ul>
 *
 * <p>该类可以用于添加特殊的 Bean 配置，目前未包含具体的 Bean 定义。
 */
@Configuration
@ComponentScan(basePackages = "org.example")
@EnableAspectJAutoProxy
public class AppConfig {
    // 这里可以添加特殊Bean配置
}

