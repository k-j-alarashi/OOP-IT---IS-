package lab7;

public class Lab7 {

    public static void main(String[] args) {
        Rectangle myBox = new Rectangle(100, 150, 200, 300);
        // get == getter == Accessor --> read only
        System.out.println("Width      : "+myBox.getWidth());
        System.out.println("Height   : "+myBox.getHeight());
        // set == setter == Mutator --> modify
        myBox.setWidth(435);
        myBox.setHeight(642);
        System.out.println("=========================");
        System.out.println("Width      : "+myBox.getWidth());
        System.out.println("Height   : "+myBox.getHeight());
    }
    
}
