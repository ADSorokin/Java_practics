package ru.dz.sorokin;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> hotDrinks = new ArrayList<>();
        HotDrinksVendingMachine hotDrinksVendingMachine =new HotDrinksVendingMachine(hotDrinks);
        hotDrinks.add(new HotDrink("Кофе Лунго", 100,90 ));
        hotDrinks.add(new HotDrink("Кофе Американо", 200,90 ));
        hotDrinks.add(new HotDrink("Кофе Каррето", 100,50 ));
        hotDrinks.add(new HotDrink("Кофе Макиато", 100,80 ));
        hotDrinks.add(new HotDrink("Чай", 200,70 ));
        hotDrinks.add(new HotDrink("Горячая вода", 200,95 ));
        hotDrinks.add(new HotDrink("Мате", 200,50 ));
        //     System.out.println(hotDrinks);

        System.out.println(hotDrinksVendingMachine.getProduct(90));
        System.out.println(hotDrinksVendingMachine.getProduct("Чай",200));
        System.out.println(hotDrinksVendingMachine.getProduct("Кофе Макиато", 100,80));

    }
}
