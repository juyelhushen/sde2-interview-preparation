package low_level_design.online_shopping_cart.design.command;

import low_level_design.online_shopping_cart.design.decorator.CartItemComponent;
import low_level_design.online_shopping_cart.entity.Cart;

public class AddCartItemCommand implements CartCommand {

    private final Cart cart;
    private final CartItemComponent item;
    private CartItemComponent previousItem; // to store the previous state for undo

    public AddCartItemCommand(Cart cart, CartItemComponent item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        previousItem = cart.getItem(item.getProductId()); // store previous item if exists
        cart.addItem(item);
    }

    @Override
    public void undo() {
        if (previousItem != null) {
            cart.addItem(previousItem);
        } else cart.removeItem(item.getProductId());
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " added to cart.";
    }
}
