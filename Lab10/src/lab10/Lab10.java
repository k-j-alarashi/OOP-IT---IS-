package lab10;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChoiceQuestion chq = new ChoiceQuestion();
        chq.setText("Which Programming Language is the Best ? ");
        chq.addChoice("c++", true);
        chq.addChoice("java", true);
        chq.addChoice("c#", false);
        chq.addChoice("python", false);
        chq.display();
        String ans = input.next();
        System.out.println("Your Answer is : "+chq.checkAnswer(ans.toLowerCase()));
    }
    
}