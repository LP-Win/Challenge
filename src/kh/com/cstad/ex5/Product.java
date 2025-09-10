package kh.com.cstad.ex5;

public class Product {
    int ID;
    String name;
    int qty;
    boolean status;

    public Product(int ID, String name, int qty, boolean status) {
        this.ID = ID;
        this.name = name;
        this.qty = qty;
        this.status = status;
    }

    public void displayProduct(){
        if(qty>0 && status){
            System.out.println("Product ID: "+ID);
            System.out.println("Prodicu Name: "+name);
            System.out.println("Product Qty: "+qty);
        }else {
            System.out.println("Product is not available!!");
        }
    }
}
