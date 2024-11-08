package org.design.simplestrategy.strategy;

import org.design.simplestrategy.model.Product;

public class Context {
    private AddToCartStrategy strategy;

    public void setStrategy(AddToCartStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(Product cart){
        strategy.addToCart(cart);
    }
}
