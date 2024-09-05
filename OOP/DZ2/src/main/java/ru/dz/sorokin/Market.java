package ru.dz.sorokin;
import java.util.*;


public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue; //Очередь покупателей
    private final List<Order> orders = new ArrayList<>();// очередь размещенных заказов FIFO
    static int count=0; //Счетчик заказов в работе

    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }




    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders(String s)

     {
        for(Actor actor: queue){
            if(!actor.isMakeOrder()){
                orders.add(new Order(s, actor.getName()));
                actor.setMakeOrder(true);
                Order o =orders.get(count);
                o.setNumberOfOrder(++count);

                System.out.println(actor.getName() + " сделал свой заказ номер очереди №:"+ o.getNumberOfOrder() +" в процессе изготовления");
            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                Order o=orders.remove(0);
                count--;
                System.out.println(actor.getName() + " получил свой заказ, номер очереди  №"+ o.getNumberOfOrder() );
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor: queue){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди и готов уходить");
            }
        }
        releaseFromMarket(releasedActors);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors){
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update(String s) {
        takeOrders(s);
        giveOrders();
        releaseFromQueue();

    }
}