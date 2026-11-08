package low_level_design.online_shopping_cart.design.command;

public interface CartCommand {
    void execute();
    void undo();
    String getDescription();
}

