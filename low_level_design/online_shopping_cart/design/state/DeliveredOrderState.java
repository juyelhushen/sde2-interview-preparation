package low_level_design.online_shopping_cart.design.state;

import low_level_design.online_shopping_cart.entity.Order;
import low_level_design.online_shopping_cart.enums.OrderStatus;
import low_level_design.online_shopping_cart.exceptions.InvalidOrderException;

public class DeliveredOrderState implements OrderState {

    @Override
    public void confirm(Order order) {
        throw new InvalidOrderException("Cannot confirm an order that has already been delivered.");
    }

    @Override
    public void ship(Order order) {
        throw new InvalidOrderException("Cannot ship an order that has already been delivered.");

    }

    @Override
    public void deliver(Order order) {
        throw new InvalidOrderException("Order is already delivered.");
    }

    @Override
    public void cancel(Order order) {
        throw new InvalidOrderException("Cannot cancel an order that has already been delivered.");
    }

    @Override
    public void returnOrder(Order order) {
        order.setState(new ReturnedOrderState());
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.DELIVERED;
    }
}
