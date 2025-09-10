package kh.com.cstad.ex6;

public class Student {
    long id;
    double java;
    double cpp;
    double javaScropt;

    public double getTotalScore(){
        return java + cpp + javaScropt;
    }

    public double getAverage(){
        return getTotalScore() / 3;
    }

    public String getResult(){
        if(getAverage()>50){
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }
    }


    public void showInfo(){
        System.out.println("ID: " + id);
        System.out.println("Total Score:" + getTotalScore());
        System.out.println("Average Score: "+ getAverage());
        System.out.println("Result: "+ getResult());
    }
}
