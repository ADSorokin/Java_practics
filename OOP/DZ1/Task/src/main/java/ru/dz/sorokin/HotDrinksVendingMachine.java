package ru.dz.sorokin;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    private final List<Product> beverages;


    public HotDrinksVendingMachine(List<Product> beverages) {
        this.beverages = beverages;

    }


    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for (Product beverage : beverages) {
            if (beverage.getName().equalsIgnoreCase(name)) {
                return  beverage;
            }
        }
        throw new IllegalStateException(String.format("Напиток c названием %s не найден.", name));

    }

    public Product getProduct(String name, int volume, int temperature){
        for(Product beverage: beverages){
            if(beverage instanceof HotDrink){
                if(beverage.getName().equalsIgnoreCase(name) && ((HotDrink) beverage).getTemperature() == temperature && ((HotDrink) beverage).getVolume() == volume ){
                    return  beverage;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s объема %d и температуры %d не найден.", name , volume, temperature));
    }

    public Product getProduct(String name, int volume){
        for(Product beverage: beverages){
            if(beverage instanceof HotDrink){
                if(beverage.getName().equalsIgnoreCase(name)  && ((HotDrink) beverage).getVolume() == volume ){
                    return  beverage;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s объема %d не найден.", name , volume));
    }

    public Product getProduct( int temperature){
        for(Product beverage: beverages){
            if(beverage instanceof HotDrink){
                if( ((HotDrink) beverage).getTemperature() == temperature ){
                    return  beverage;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c  температуры %d не найден.", temperature));
    }



}
