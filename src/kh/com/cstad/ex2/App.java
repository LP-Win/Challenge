package kh.com.cstad.ex2;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Food food = new Food();
        food.name = "Burgar";
        food.price = 3.4;
        food.expDate = LocalDateTime.of(2025,10,11,12,0);
        food.canEat();
        long expiredDay = food.showExpDay();
        System.out.println("Day until Expired : "+ expiredDay);
    }
}
