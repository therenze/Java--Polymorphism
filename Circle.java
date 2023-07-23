package Polymorphism;
public class Circle  extends Shape{

    double radius;
    double cArea;

    Circle(float radius){
        this.radius = radius;
    }


    void calculateArea(){
        cArea = (float) (3.14 * radius * radius);
        System.out.println("Circle Area: "+cArea);
    }

}
