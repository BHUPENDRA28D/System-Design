package SOLID_PRINCIPLE.Open_Close_Principle.BetterCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<NotificationClass> notification){

        for(NotificationClass n: notification){
            n.sendNotification();
        }
    }
}
