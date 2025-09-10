package kh.com.cstad.ex2;

import java.time.Duration;
import java.time.LocalDateTime;

public class Food {
    String name;
    double price;
    LocalDateTime expDate;

    public long showExpDay(){
        LocalDateTime today = LocalDateTime.now();
        return Duration.between(today, expDate).toDays();
    }

    public void canEat(){
        LocalDateTime today = LocalDateTime.now();
        if (today.isAfter(expDate)){
            System.out.println("It's expired, you can't eat!!");
        }else {
            System.out.println("Yes, You can eat!");
        }
    }
}
