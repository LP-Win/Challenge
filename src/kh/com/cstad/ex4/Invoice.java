package kh.com.cstad.ex4;

import java.time.LocalDateTime;

public class Invoice {
    String number;
    LocalDateTime invoiceDate;
    double discount;
    double totalAmount;

    public double findPayment(){
        double discountedAmount = totalAmount * (discount/100);
        return totalAmount - discountedAmount;
    }
}
