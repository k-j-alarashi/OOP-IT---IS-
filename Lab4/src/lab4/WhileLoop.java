package lab4;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1 ;
        int sum = 0 ;
        while(i<=100){
            sum = sum + i ; // or sum+=i;
            i++;
        }
        System.out.println("sum = "+sum);
    }
}
