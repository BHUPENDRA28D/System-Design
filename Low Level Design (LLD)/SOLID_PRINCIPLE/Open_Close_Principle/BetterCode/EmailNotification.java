package SOLID_PRINCIPLE.Open_Close_Principle.BetterCode;

public class EmailNotification implements NotificationClass{
    @Override
    public void sendNotification() {
        System.out.println("Send Email!");
    }
}
