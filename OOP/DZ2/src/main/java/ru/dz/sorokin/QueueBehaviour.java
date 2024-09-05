package ru.dz.sorokin;

public interface QueueBehaviour {


    void takeInQueue(Actor actor);
    void giveOrders();
    void releaseFromQueue();
}
