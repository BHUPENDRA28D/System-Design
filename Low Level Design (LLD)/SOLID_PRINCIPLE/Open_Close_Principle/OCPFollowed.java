package SOLID_PRINCIPLE.Open_Close_Principle;

import java.util.ArrayList;
import java.util.List;

public class OCPFollowed {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Speakers Boat ",3500));
        cart.addProduct(new Product("Boat 20W Adapter",800));



    ShoppingCartPrinterr cartPrinterr = new ShoppingCartPrinterr(cart);
    cartPrinterr.printInvoice();

    ShoppingStorage db = new ShoppingStorageSQL();
    ShoppingStorage mongo = new ShoppingStorageMongo();
    ShoppingStorage fs = new ShoppingStorageFileSystem();

    db.save(cart);
    mongo.save(cart);
    fs.save(cart);

}
}
class ShoppingCart {
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

//Invoice printer
class ShoppingCartPrinterr {

    private ShoppingCart cart;

    public ShoppingCartPrinterr(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Shopping Cart Invoice:");
        for (Product p : cart.getProducts()) {
            System.out.println(p.name + " - Rs " + p.price);
        }
        System.out.println("Total: Rs " + cart.calculateTotal());
    }
}

//OCP followed here by creating one interface and all are implementing it.

 interface ShoppingStorage{
     void save(ShoppingCart cart);
}

class ShoppingStorageSQL implements ShoppingStorage {

    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving to SQL DB");
    }
}

class ShoppingStorageMongo implements ShoppingStorage{
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving to Mongo DB");
    }
}

class ShoppingStorageFileSystem implements ShoppingStorage{
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving to File System DB");
    }
}