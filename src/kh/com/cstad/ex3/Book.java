package kh.com.cstad.ex3;

import java.time.LocalDateTime;

public class Book {
    String code;
    String title;
    String author;
    LocalDateTime publicAt;

    public Book(String code, String title, String author, LocalDateTime publicAt){
        this.code = code;
        this.title = title;
        this.author = author;
        this.publicAt = publicAt;
    }

    public Book(){
        this.code = "ISTAD-0001";
        this.title = "JAVA";
        this.author = "ISTAD";
        this.publicAt = LocalDateTime.now();
    }

}
