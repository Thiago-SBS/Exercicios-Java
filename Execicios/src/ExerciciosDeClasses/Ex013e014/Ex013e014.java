package ExerciciosDeClasses.Ex013e014;

import java.util.Scanner;

public class Ex013e014 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Thiago", 2100);

        System.out.println(e1.toString());
        e1.increase(10);
        System.out.println(e1.toString());
    }
}