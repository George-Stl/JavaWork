package Project;

import java.util.ArrayList;

public class Circle extends ArrayList {

    private double radius = 1;
    /** Находит площадь этого круга */
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "Круг радиуса " + this.radius;
    }
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("Радиус равен " + myCircle.radius);
    }
}