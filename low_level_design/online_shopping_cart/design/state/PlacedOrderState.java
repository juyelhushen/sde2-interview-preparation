package low_level_design.online_shopping_cart.design.state;

import low_level_design.online_shopping_cart.entity.Order;
import low_level_design.online_shopping_cart.enums.OrderStatus;
import low_level_design.online_shopping_cart.exceptions.InvalidOrderException;

public class PlacedOrderState implements OrderState {

    @Override
    public void confirm(Order order) {
        throw new InvalidOrderException("Order is already placed and cannot be confirmed again.");
    }

    @Override
    public void ship(Order order) {
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliver(Order order) {
        throw new InvalidOrderException("Order must be shipped before it can be delivered.");
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelOrderState());
    }

    @Override
    public void returnOrder(Order order) {
        throw new InvalidOrderException("Order must be delivered before it can be returned.");
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.PLACED;
    }
}
