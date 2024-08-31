package ru.dz.sorokin;

public class HotDrink extends Beverage {

    private int temperature;

    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }



    @Override
    public String toString() {
        return "HotDrink{" +
                " Название='" + super.getName() + '\'' +
                " Tемпература='" + this.temperature + '\'' +
                " Объем='" + super.getVolume() + '\'' +
//                ", Цена=" + super.getCost() +
                '}';
    }
}


