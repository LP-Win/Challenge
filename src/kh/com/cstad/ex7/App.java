package kh.com.cstad.ex7;

public class App {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "LP-Win";
        teacher.basedSalary = 1000;
        teacher.otTime = 15;
        teacher.rate = 3;
        teacher.getSalary();
    }
}
