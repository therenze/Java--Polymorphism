package Polymorphism;
public class Rectangle  extends Shape{

    double height ;
    double width ;
    double rArea;

    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    void calculateArea(){
        rArea = width * height;
        System.out.println("Rectangle Area: "+rArea);
    }

}
