package lab7;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[5];
        
        System.out.println("Enter Numbers   : ");
        for (int i = 0; i < x.length; i++) {
            x[i]=in.nextInt();
        }
        
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+"     "); 
       }
    }
}
