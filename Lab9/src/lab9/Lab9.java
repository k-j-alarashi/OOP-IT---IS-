package lab9;

import java.util.ArrayList;

public class Lab9 {

    public static void main(String[] args) {
        Student s = new Student(202310, "Ahmed", 21, "CYN");
        System.out.println(s.toString()); // s == s.toString()
        System.out.println("===================");
        Teacher t = new Teacher(234, "Khaled", 23, 32903);
        System.out.println(t.toString()); // t == t.toString()
    }

}
