package org.design.simplestrategy.strategy;

import org.design.simplestrategy.model.Product;

public class ServicoFibraAddToCartStrategy implements AddToCartStrategy {
    @Override
    public void addToCart(final Product product) {
        // produto com taxas referentes a instalacao
        product.setTotal(product.getTotal() + 20);
        System.out.printf("Valor do produto com taxa de instalação: %f\n", product.getTotal());
    }
}
