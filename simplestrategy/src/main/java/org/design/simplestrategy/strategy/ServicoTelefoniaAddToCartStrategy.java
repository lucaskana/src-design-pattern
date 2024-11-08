package org.design.simplestrategy.strategy;

import org.design.simplestrategy.model.Product;

public class ServicoTelefoniaAddToCartStrategy implements AddToCartStrategy {
    @Override
    public void addToCart(final Product product) {
        // Adicionando custo de mao de obra
        product.setTotal(product.getTotal() * 1.25);
        System.out.printf("Valor do produto com imposto aplicado: %f\n", product.getTotal());
    }
}
