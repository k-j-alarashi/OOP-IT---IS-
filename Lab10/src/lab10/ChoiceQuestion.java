package lab10;

public class ChoiceQuestion extends Question {
    private String choices[];
    private int i ; // i for index of array ( choices )

    public ChoiceQuestion() {
        choices = new String[4];
        i = 0 ;
    }
    
    public void addChoice(String choice , boolean state ){
        choices[i] = choice ;
        if(state){
            setAnswer(choice); // method is inherited from super class ( Question )
        }
        i++;
    }

    @Override
    public void display() {
        super.display();
        for (int j = 0; j < choices.length; j++) {
            System.out.println("    "+(j+1)+" - "+choices[j]);
        }
    }
    
    
}
