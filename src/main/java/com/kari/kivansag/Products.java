package com.kari.kivansag;

public class Products 
{
    private String name;
    private int cost;
    private int stock;

    public Products(String name, int cost) 
    {
        this.name = name;
        this.cost = cost;
        
        stock = 0;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getStock() {
        return stock;
    }
    
    
}
