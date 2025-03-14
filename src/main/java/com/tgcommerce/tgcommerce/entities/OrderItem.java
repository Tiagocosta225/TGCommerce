package com.tgcommerce.tgcommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private Double price;

    private long product;

    public OrderItem() {
    }

    public OrderItem(long order, long product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public long getOrder(){
        return  id.getOrder();
    }

    public void setOrder(long order){
        id.setOrder(order);
    }

    public void setProduct(long product){
        id.setProduct(product);
    }

    public long getProduct() {
        return id.getProduct();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public java.lang.Double getPrice() {
        return price;
    }

    public void setPrice(java.lang.Double price) {
        this.price = price;
    }
}
