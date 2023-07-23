package Polymorphism;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {

    Circle circle = new Circle(0);
    Rectangle rectangle = new Rectangle(0, 0);
    Scanner input = new Scanner(System.in);


    System.out.print("Enter the radius of the Circle: ");
    circle.radius = input.nextInt();

    System.out.print("Enter the width of the Rectangle: ");
    rectangle.width = input.nextInt();

    System.out.print("Enter the height of the Rectangle: ");
    rectangle.height = input.nextInt();

    circle.calculateArea();
    rectangle.calculateArea();

}
    
}
