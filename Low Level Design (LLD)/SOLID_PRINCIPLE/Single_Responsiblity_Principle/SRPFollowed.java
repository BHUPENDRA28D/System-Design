package SOLID_PRINCIPLE.Single_Responsiblity_Principle;

import java.util.ArrayList;
import java.util.List;

public class SRPFollowed {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Mobile",45000));
        cart.addProduct(new Product("Case",250));
        cart.addProduct(new Product("HeadPhone",2250));

        ShoppingCartPrinter shoppingCartPrinter = new ShoppingCartPrinter(cart);
        ShoppingCartStorage db = new ShoppingCartStorage(cart);


        shoppingCartPrinter.printInvoice();
        db.saveToDatabase();
    }
}


//// Product class representing any item in eCommerce.
//class Products {
//    public String name;
//    public double price;
//
//    public Products(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//}


// 1. ShoppingCart: Only responsible for Cart related business logic.

class ShoppingCarts{
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    // Calculates total price in cart.
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}

//2.ShoppingCartPrint: Only responsible for printing invoices.

class ShoppingCartPrinter{

    private  ShoppingCart cart;

    public ShoppingCartPrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice(){
        System.out.println("Shopping Cart Invoice:");

        for (Product p: cart.getProducts()){
            System.out.println(p.name+" Rs :"+p.price);

        }
        System.out.println("Total :Rs "+cart.calculateTotal());
    }
}


// 3. ShoppingCartStorage: Only responsible for saving cart to DB
class ShoppingCartStorage {
    private ShoppingCart cart;

    public ShoppingCartStorage(ShoppingCart cart) {
        this.cart = cart;
    }

    public void saveToDatabase() {
        System.out.println("Saving shopping cart to database...");
    }
}