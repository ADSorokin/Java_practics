package ru.dz.sorokin;

public abstract class Actor implements ActorBehaviour {
    protected final String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

    @Override
    public boolean isTakeOrder() {

        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

}
