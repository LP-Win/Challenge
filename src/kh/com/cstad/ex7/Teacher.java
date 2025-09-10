package kh.com.cstad.ex7;

public class Teacher {
    String name;
    double basedSalary;
    double otTime;
    double rate;

    public void getSalary(){
        double salary = basedSalary + (otTime * rate);
        System.out.println("Salary: " + salary);
    }

}
