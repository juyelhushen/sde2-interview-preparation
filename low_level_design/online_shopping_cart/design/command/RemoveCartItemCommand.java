package low_level_design.online_shopping_cart.design.command;

import low_level_design.online_shopping_cart.design.decorator.CartItemComponent;
import low_level_design.online_shopping_cart.entity.Cart;

public class RemoveCartItemCommand implements CartCommand {

    private final Cart cart;
    private final CartItemComponent item;
    private CartItemComponent previousItem; // to store the previous state for undo

    public RemoveCartItemCommand(Cart cart, CartItemComponent cartItemComponent) {
        this.cart = cart;
        this.item = cartItemComponent;
    }

    @Override
    public void execute() {
        previousItem = cart.getItem(item.getProductId()); // store previous item if exists
        cart.removeItem(item.getProductId());
    }

    @Override
    public void undo() {
        if (previousItem != null) {
            cart.addItem(previousItem);
        } else {
            // If there was no previous item, we can't undo the removal
            // Optionally, you could throw an exception or log a message here
        }
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " removed from cart.";
    }
}
