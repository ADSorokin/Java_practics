package ru.dz.sorokin;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();


        market.acceptToMarket(new Human("Алекс"));
        market.acceptToMarket(new Human("Дмитрий"));
        market.acceptToMarket(new Human("Олег"));



        market.update("Кофе");


    }
}
