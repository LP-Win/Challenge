package kh.com.cstad.ex3;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("ISTAD-0003", "CPP", "ISTAD", LocalDateTime.now());
    }
}
