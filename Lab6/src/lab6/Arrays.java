package lab6;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int[] x = new int[5];
//        System.out.println("Enter Numbers to Array : ");
//        for (int i = 0; i < x.length; i++) {
//            x[i] = in.nextInt();
//        }

        int[] x = {19, 112, 453, 4, 500};
        display(x);
        
        System.out.println("Enter the Number You Want to Search : ");
        int s = in.nextInt();
        System.out.println("Index of searched element : "+search(x, s));
    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index = " + i + "      element = " + a[i]);
        }
        System.out.println("==============================");
    }
    
    public static void delete(int[] x , int del){
        for (int i = 0; i < x.length; i++) {
            if(del==x[i]){
                x[i]=0;
            }
        }
    }
    
    public static int search(int[] x , int s){
        for (int i = 0; i < x.length; i++) {
            if(s==x[i]){
                return i;
            }            
        }
        return -1;
    }
    
}
