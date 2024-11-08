package org.design.simplestrategy;

import org.design.simplestrategy.model.Product;
import org.design.simplestrategy.strategy.Context;
import org.design.simplestrategy.strategy.ProdutoVarejoAddToCartStrategy;
import org.design.simplestrategy.strategy.ServicoFibraAddToCartStrategy;
import org.design.simplestrategy.strategy.ServicoTelefoniaAddToCartStrategy;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Context context = new Context();

        ArrayList<Product> listaProdutos =  new ArrayList<>();

        // Lista de produtos que precisam ser adicionados ao carrinho.
        listaProdutos.add(new Product("varejo", 100));
        listaProdutos.add(new Product("fibra", 100));
        listaProdutos.add(new Product("telefonia", 100));

        // Chamada da strategy para fazer a tratativa de calculo para cada tipo de produto.
        for(Product produto: listaProdutos){
            switch (produto.getTipoProduto()){
                case "varejo":
                    context.setStrategy(new ProdutoVarejoAddToCartStrategy());
                    context.execute(produto);
                    break;
                case "fibra":
                    context.setStrategy(new ServicoFibraAddToCartStrategy());
                    context.execute(produto);
                    break;
                case "telefonia":
                    context.setStrategy(new ServicoTelefoniaAddToCartStrategy());
                    context.execute(produto);
                    break;
            }
        }
    }
}
