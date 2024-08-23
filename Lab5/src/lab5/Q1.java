package lab5;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID    : ");
        int id = in.nextInt();
        System.out.println("Enter Name  : ");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("Enter Age   : ");
        int age = in.nextInt();
        System.out.println("Enter Major : ");
        String major = in.next();
        System.out.println("_________Student Details_________");
        System.out.println("ID          : "+id);
        System.out.println("NAME        : "+name);
        System.out.println("AGE         : "+age);
        System.out.println("MAJOR       : "+major);
        System.out.println("_________________________________");
    }
}
