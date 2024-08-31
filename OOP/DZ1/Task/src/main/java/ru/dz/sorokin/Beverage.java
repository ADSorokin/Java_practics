package ru.dz.sorokin;

public abstract class Beverage extends Product {
    private int volume;

    public Beverage(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Beverage(String name, int volume) {
        super(name);
        this.volume =volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
