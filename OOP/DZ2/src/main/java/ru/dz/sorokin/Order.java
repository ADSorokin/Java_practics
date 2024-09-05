package ru.dz.sorokin;

public class Order {
    public String description;

    public String orderFor;

    private int numberOfOrder;

    public Order(String description,String orderFor) {
        this.description = description;
        this.orderFor = orderFor;

    }


    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }
}