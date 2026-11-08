package low_level_design.inventory_update_service.observer;

import low_level_design.inventory_update_service.events.InventoryEvent;


// Any component that wants to react to inventory changes implements this.
// InventoryService (the subject) calls onEvent() without knowing
// what's on the other end — could be NotificationDispatcher today,
// an analytics low_level_design.logger or a reorder service tomorrow.
public interface InventoryObserver {
    void onEvent(InventoryEvent event);
}
