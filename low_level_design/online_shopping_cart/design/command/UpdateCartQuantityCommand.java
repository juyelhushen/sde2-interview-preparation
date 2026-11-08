package low_level_design.online_shopping_cart.design.command;

import low_level_design.online_shopping_cart.design.decorator.BaseCartItem;
import low_level_design.online_shopping_cart.design.decorator.CartItemComponent;
import low_level_design.online_shopping_cart.entity.Cart;
import low_level_design.online_shopping_cart.entity.Product;

public class UpdateCartQuantityCommand implements CartCommand {

    private final Cart cart;
    private final Product product;
    private final int quantity;
    private CartItemComponent previousItem; // to store the previous state for undo

    public UpdateCartQuantityCommand(Cart cart, Product product, int quantity) {
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
    }


    @Override
    public void execute() {
        previousItem = cart.getItem(product.getProductId()); // store previous item if exists
        // replace with new quantity — preserves decorators on BaseCartItem
        // (for simplicity, update creates a fresh BaseCartItem; real systems
        //  would rebuild the decorator chain with the new quantity)
        cart.addItem(new BaseCartItem(product, quantity));
    }

    @Override
    public void undo() {
        if (previousItem != null) {
            cart.addItem(previousItem);
        } else {
            // If there was no previous item, we can't undo the update
            // Optionally, you could throw an exception or log a message here
        }
    }

    @Override
    public String getDescription() {
        return product.getProductName() + " quantity updated to " + quantity + " in cart.";
    }
}
