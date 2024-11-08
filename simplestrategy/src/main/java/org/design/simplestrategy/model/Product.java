package org.design.simplestrategy.model;

public class Product {

    private String tipoProduto;
    private double total;

    public Product(String tipoProduto, double total){
        this.tipoProduto = tipoProduto;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

}
