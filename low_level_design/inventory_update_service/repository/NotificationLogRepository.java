package low_level_design.inventory_update_service.repository;

import low_level_design.inventory_update_service.entity.Notification;

import java.util.List;

public interface NotificationLogRepository {
    void save(Notification notification);
    List<Notification> findByUserId(String userId);
}
