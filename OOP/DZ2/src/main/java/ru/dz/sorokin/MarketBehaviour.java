package ru.dz.sorokin;


import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);

    void takeOrders(String s);

    void releaseFromMarket(List<Actor> actors);


    void update(String s);
}





