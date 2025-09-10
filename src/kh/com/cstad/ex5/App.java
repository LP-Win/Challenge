package kh.com.cstad.ex5;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product(02, "Crank Shaft", 3 ,true);
        Product p2 = new Product(05, "pump", 7 ,false);

        p1.displayProduct();
        p2.displayProduct();

    }
}
