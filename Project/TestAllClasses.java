package Project;

import java.util.ArrayList;

public class TestAllClasses {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        java.util.Date date = new java.util.Date();
        date.getTime();
        list.add(date);
        Loan loan = new Loan();
        list.add(loan);
        String s = "TestClasses";
        list.add(s);
        Circle circle = new Circle(15.4);
        list.add(circle);
        //System.out.println("Отображение всех элементов списка: " + list.toString());
        System.out.println("\nОтображение элементов через цикл\n");
        for(Object obj : list){
            System.out.println(obj + "\n");
        }
    }
}
