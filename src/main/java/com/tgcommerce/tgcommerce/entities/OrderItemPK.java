package com.tgcommerce.tgcommerce.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private long order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private long product;

    public OrderItemPK (){

    }

    public OrderItemPK(long order, long product) {
        this.order = order;
        this.product = product;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    public long getProduct() {
        return product;
    }

    public void setProduct(long product) {
        this.product = product;
    }
}
