package low_level_design.online_shopping_cart.design.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CartCommandInvoker {

    private final Deque<CartCommand> history = new ArrayDeque<>();
    private static final int MAX_HISTORY_SIZE = 20; // Limit the history size to prevent memory issues

    public void execute(CartCommand command) {
        command.execute();
        history.push(command);
        System.out.printf("[CART]: %s%n", command.getDescription());

        if (history.size() > MAX_HISTORY_SIZE) {
            history.pollLast(); // Remove the oldest command if we exceed the max history size
        }
    }

    public boolean undo() {
        if (history.isEmpty()) {
            System.out.printf("[CART]: No commands to undo.%n");
            return false;
        }

        CartCommand command = history.pop();
        command.undo();
        System.out.printf("[CART]: Undone: %s%n", command.getDescription());
        return true;
    }
}
