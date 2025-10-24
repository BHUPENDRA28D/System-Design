package SOLID_PRINCIPLE.Open_Close_Principle.ProblemeticCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<NotificationType> notificationTypes){

        for (NotificationType type: notificationTypes){

            if(type == NotificationType.WHATSAPP){
                type.sendWhatsappNotificaiton();
            }
            else if(type ==NotificationType.SMS){
                type.sendSMSNotification();
            } else if (type == NotificationType.EMAIL) {
                type.sendEmailNotificaiton();
            }
        }
    }
}
