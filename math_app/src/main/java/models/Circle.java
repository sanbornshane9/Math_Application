package models;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Circle extends Shape{

    private double radius;
    private final double PI = 3.14;
    private static int totalCount = 0;

    {
        totalCount++;
    }

    public Circle(double r){
        radius = r;
        calcPerimeter();
        calcSA();
        setName();
    }

    protected void calcPerimeter() {
        perimeter = (2*PI*radius);
    }

    protected void calcSA() {
        SA = (PI * radius * radius);
    }

    protected void setName() {
        name = "circle";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", SA=" + SA +
                '}';
    }

    @Override
    public int getTotalCount() {
        return totalCount;
    }


    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        totalCount++;
    }


    public double getRadius() {
        return radius;
    }

    public double getPI() {
        return PI;
    }


}
