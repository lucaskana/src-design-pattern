package org.design.simplestrategy.strategy;

import org.design.simplestrategy.model.Product;

public class ProdutoVarejoAddToCartStrategy implements AddToCartStrategy {
    @Override
    public void addToCart(final Product product) {
        // produto calcula com taxa de envio 15 reais
        product.setTotal(product.getTotal() + 15);
        System.out.printf("Valor do produto com taxa de entrega: %f\n", product.getTotal());
    }
}
