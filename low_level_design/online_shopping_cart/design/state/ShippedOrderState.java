package low_level_design.online_shopping_cart.design.state;

import low_level_design.online_shopping_cart.entity.Order;
import low_level_design.online_shopping_cart.enums.OrderStatus;
import low_level_design.online_shopping_cart.exceptions.InvalidOrderException;

public class ShippedOrderState implements OrderState {

    @Override
    public void confirm(Order order) {
        throw new InvalidOrderException("Cannot confirm an order that has already been shipped.");
    }

    @Override
    public void ship(Order order) {
        throw new InvalidOrderException("Order is already shipped.");
    }

    @Override
    public void deliver(Order order) {
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void cancel(Order order) {
        throw new InvalidOrderException("Cannot cancel an order that has already been shipped.");
    }

    @Override
    public void returnOrder(Order order) {
        throw new InvalidOrderException("Cannot return an order that has already been shipped.");
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.SHIPPED;
    }
}
