package low_level_design.inventory_update_service.strategy;

import low_level_design.inventory_update_service.entity.Notification;

public interface ChannelStrategy {
    void send(Notification notification);
}
