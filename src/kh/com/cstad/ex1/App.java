package kh.com.cstad.ex1;

public class App {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.Base = 12;
        triangle.Height = 16;
        double Area = triangle.findArea();
        System.out.println("Triangle Area: " + Area);

    }
}
