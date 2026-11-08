package low_level_design.inventory_update_service.events;

import java.time.LocalDateTime;

public record OutOfStockEvent(
        String productId,
        String productName,
        LocalDateTime occurredAt
) implements InventoryEvent {

}
