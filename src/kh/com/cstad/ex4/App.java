package kh.com.cstad.ex4;

import java.time.LocalDateTime;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.number = UUID.randomUUID().toString();
        invoice.invoiceDate = LocalDateTime.now();
        invoice.totalAmount = 490;
        invoice.discount = 10;


        double payment = invoice.findPayment();
        System.out.println("Payment : " + payment);
    }
}
