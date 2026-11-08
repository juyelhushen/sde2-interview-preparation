package low_level_design.inventory_update_service.strategy;

import low_level_design.inventory_update_service.entity.Notification;

public class PushNotificationStrategy implements ChannelStrategy {

    public static final PushNotificationStrategy INSTANCE = new PushNotificationStrategy();
    private PushNotificationStrategy() {}

    @Override
    public void send(Notification notification) {
        System.out.printf("  [PUSH] To device (userId=%s) | %s | %s%n",
                notification.getUserId(), notification.getTitle(), notification.getBody());
        notification.markSent();
    }
}
