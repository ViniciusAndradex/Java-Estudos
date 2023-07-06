import entities.enums.OrderStatus;
import entities.Order;

import java.util.Date;

public class DemoOrder {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        OrderStatus os1 = OrderStatus.valueOf("DELIVERED");

        System.out.println(order);

        order.setStatus(OrderStatus.SHIPPED);

        System.out.println(order);
        System.out.println(os1);

    }
}
