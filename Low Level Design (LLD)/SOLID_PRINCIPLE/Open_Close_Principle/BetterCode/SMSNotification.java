package SOLID_PRINCIPLE.Open_Close_Principle.BetterCode;

public class SMSNotification implements NotificationClass{
    @Override
    public void sendNotification() {
        System.out.println("Send SMS");
    }
}
