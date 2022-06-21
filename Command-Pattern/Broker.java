import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    private PriorityQueue<Integer> playlist = new PriorityQueue<Integer>();


    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}