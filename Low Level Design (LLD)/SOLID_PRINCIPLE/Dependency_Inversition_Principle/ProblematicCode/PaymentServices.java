package SOLID_PRINCIPLE.Dependency_Inversition_Principle.ProblematicCode;


import java.util.Scanner;

public class PaymentServices {

    public static void main(String[] args) {
        RazorPayService rs = new RazorPayService(852,6161,"Arnid Tiwari");
        rs.makeRazorPayemt(23);

    }

}
class RazorPayService{



    double amount;
    int pinCode;
    String whomToSend;

    public RazorPayService(double amount, int pinCode, String whomToSend) {

        this.amount = amount;
        this.pinCode = pinCode;
        this.whomToSend = whomToSend;
    }

    public boolean makeRazorPayemt(double amount){
        if(pinCode == 6161){
            System.out.println("Payment of : "+amount+" successfully");
            return true;
        }
        System.out.println("PIN incorrect!");
        return false;

    }

}