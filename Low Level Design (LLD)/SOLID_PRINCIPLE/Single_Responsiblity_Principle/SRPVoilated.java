package SOLID_PRINCIPLE.Single_Responsiblity_Principle;

import java.util.ArrayList;
import java.util.List;

public class SRPVoilated {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop",55000));
        cart.addProduct(new Product("Mouse",800));
        cart.addProduct(new Product("KeyBoard",1800));

        cart.printInvoice();
        cart.saveToDatabase();
    }
}




//Voilation of SRP: ShoppingCart is handling multiple responsiblites.

class ShoppingCart{
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getProducts(){
        return products;
    }

    //1. Calculate Price of cart.

    public double calculateTotal(){
        double total =0;

        for(Product p : products){
            total+= p.price;
        }
        return total;
    }

    //2.Voilationg SRP - Prints invoice(should be separte class)

    public void  printInvoice(){
        System.out.println("Shopping Cart Invoice :");
        for (Product p: products){
            System.out.println(p.name+" Rs : "+p.price);
        }

        System.out.println("Total : "+calculateTotal());
    }

    //3.save to db
    public void saveToDatabase(){
        System.out.println("Saving shopping cart to db.");
    }
}