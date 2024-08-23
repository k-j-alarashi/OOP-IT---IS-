/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author khale
 */
public class Nested_IF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if(x>y){
            if(x>z){
                System.out.println(x);
            }
            else{
                System.out.println(z);
            }
        }
        else{
            if(y>z){
                System.out.println(y);
            }
            else{
                System.out.println(z);
            }
        }
    }
}
