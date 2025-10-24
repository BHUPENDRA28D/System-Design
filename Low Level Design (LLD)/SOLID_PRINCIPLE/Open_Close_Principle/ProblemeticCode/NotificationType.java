package SOLID_PRINCIPLE.Open_Close_Principle.ProblemeticCode;

public enum NotificationType {

    SMS,
    WHATSAPP,
    EMAIL;

    public void sendSMSNotification(){
        System.out.println("Sending SMS");
    }

    public void sendEmailNotificaiton(){
        System.out.println("Sending SMS");
    }


    public void sendWhatsappNotificaiton(){
        System.out.println("Sending Whatsapp Msg");
    }

}
