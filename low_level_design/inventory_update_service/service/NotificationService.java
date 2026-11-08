package low_level_design.inventory_update_service.service;

import low_level_design.inventory_update_service.entity.Notification;
import low_level_design.inventory_update_service.entity.User;
import low_level_design.inventory_update_service.enums.EventType;
import low_level_design.inventory_update_service.enums.NotificationChannel;
import low_level_design.inventory_update_service.factory.ChannelStrategyFactory;
import low_level_design.inventory_update_service.repository.NotificationLogRepository;
import low_level_design.inventory_update_service.strategy.ChannelStrategy;

public class NotificationService {
    private final NotificationLogRepository notificationLogRepository;

    public NotificationService(NotificationLogRepository notificationLogRepository) {
        this.notificationLogRepository = notificationLogRepository;
    }

    public void dispatch(User user, String productId, EventType type,
                         NotificationChannel channel, String title, String body, String actionUrl) {

        Notification notification = new Notification.Builder(
                user.getUserId(),
                productId,
                type,
                channel
        )
                .actionUrl(actionUrl)
                .body(body)
                .title(title)
                .build();

        ChannelStrategy strategy = ChannelStrategyFactory.getStrategy(channel);
        strategy.send(notification);
        notificationLogRepository.save(notification);
    }
}
