package SOLID_PRINCIPLE.Open_Close_Principle;


import java.util.ArrayList;
import java.util.List;

public class OCPVoliated {


    public static void main(String[] args) {
        Shoppingcart cart = new Shoppingcart();
        cart.addProduct(new Product("Body Lotions",520));
        cart.addProduct(new Product("Body Wash",850));
        cart.addProduct(new Product("Paper towels",600));
        cart.addProduct(new Product("Ciented Candles",1200));
        cart.addProduct(new Product("Body Moisturitor",300));

        ShopingCartPrinter printer =new ShopingCartPrinter(cart);
        printer.printInvoice();

        ShoppingCartStorage cartStorage = new ShoppingCartStorage(cart);
        cartStorage.saveToSQLDB();
    }
}

 class Product{

    String name;
    double price;

     public Product(String name, double price) {
         this.name = name;
         this.price = price;
     }
 }

 //
class Shoppingcart{

    private List<Product> products = new ArrayList<>();

   public void addProduct(Product p){
        products.add(p);
    }


     public List<Product> getProducts() {
         return products;
     }

     public double calculateTotal(){
       double total = 0;
       for (Product p :products){
           total = total+p.price;
       }

       return total;
     }

 }

 class ShopingCartPrinter{
    private  Shoppingcart  cart;

    public ShopingCartPrinter  (Shoppingcart cart){
        this.cart =cart;
    }

    public void printInvoice(){

        System.out.println("Shopping Cart Invoice :");
         for(Product p: cart.getProducts()){
             System.out.println(p.name +" - Rs : "+p.price);
         }

        System.out.println("Total Rs : "+cart.calculateTotal());
    }
 }


 class ShoppingCartStorage{
    private Shoppingcart cart;

     public ShoppingCartStorage(Shoppingcart cart) {
         this.cart = cart;
     }

     void saveToSQLDB(){
         System.out.println("Saving shopping cart to SQL");
     }

     void saveToMongoDatabase() {
         System.out.println("Saving shopping cart to Mongo DB...");
     }

     void saveToFile() {
         System.out.println("Saving shopping cart to File...");
     }
 }