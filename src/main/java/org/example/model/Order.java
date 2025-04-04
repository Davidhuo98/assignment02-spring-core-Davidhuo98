package org.example.model;

/**
 * Order 类表示一个订单对象，包含订单的唯一标识符、产品名称和订单金额。
 */
public class Order {
    private String id;       // 订单的唯一标识符
    private String product;  // 订单中的产品名称
    private double amount;   // 订单的金额

    /**
     * 构造函数用于创建一个新的 Order 对象。
     *
     * @param id      订单的唯一标识符，不能为空。
     * @param product 订单中的产品名称，不能为空。
     * @param amount  订单的金额，必须为非负数。
     */
    public Order(String id, String product, double amount) {
        this.id = id;
        this.product = product;
        this.amount = amount;
    }

    /**
     * 获取订单的金额。
     *
     * @return 返回订单的金额。
     */
    public double getAmount() {
        return amount;
    }

    /**
     * 设置订单的金额。
     *
     * @param amount 订单的新金额，必须为非负数。
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * 获取订单的唯一标识符。
     *
     * @return 返回订单的唯一标识符。
     */
    public String getId() {
        return id;
    }

    /**
     * 设置订单的唯一标识符。
     *
     * @param id 订单的新唯一标识符，不能为空。
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取订单中的产品名称。
     *
     * @return 返回订单中的产品名称。
     */
    public String getProduct() {
        return product;
    }

    /**
     * 设置订单中的产品名称。
     *
     * @param product 订单的新产品名称，不能为空。
     */
    public void setProduct(String product) {
        this.product = product;
    }
}
