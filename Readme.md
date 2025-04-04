[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Hb7-LAVz)
### **Web应用开发作业02：Spring IoC和AOP实践**
**目标**：Spring 框架是 Java 开发中的核心技术，其中 IoC（控制反转）和 AOP（面向切面编程）是其重要机制。
本次作业旨在帮助学生掌握 Spring IoC 容器的 Bean 装配方式及 Spring AOP 的实现方式，并能够在实际应用场景中进行选择和使用。

---

### **任务描述**

1. **场景选择：** 学生需根据实际应用场景自行设定一个简单业务（如订单管理、用户认证、日志记录、缓存等）。
2. **Spring IoC 容器的 Bean 装配方式（任选其一）：**
    - **XML 配置方式**：在 `applicationContext.xml` 中定义 Bean，并进行依赖注入。
    - **Java 配置方式**：使用 `@Configuration` 和 `@Bean` 注解进行 Bean 定义。
    - **注解方式**：使用 `@Component`、`@Service`、`@Repository` 等注解实现 Bean 注册。
3. **Spring AOP 的实现方式（任选其一）：**
    - **XML 配置方式**：在 XML 文件中定义切面、切点和通知。
    - **JDK 动态代理方式**：使用 Java 代码手动创建切面并织入目标对象。
4. **代码组织：**
    - 所有代码应清晰分层，包括业务逻辑层(service)、数据访问层（dao, 可选）和切面逻辑层(aspect)。
    - 代码应包含适当测试代码（写入org.example.Main），用于验证 Bean 装配和 AOP 织入效果。
---

## **作业要求**
1. **功能完整**：任意实现一种Spring IoC 容器的 Bean 装配方式，以及任选一种Spring AOP 的实现方式。
2. **关键代码及解释**：请在代码中添加必要的注释。
3. **实验报告**：需要包含简单的应用场景，运行成功的截图（请放在documents文件夹中）。
---

### **评分标准（100 分）**
1. IoC Bean 装配方式实现（40 分）
2. AOP 织入方式实现（40 分）
3. 代码风格与注释（10 分） 
4. 实验报告完整性（10 分）


---
