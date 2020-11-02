package models;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Triangle extends Shape{

    private double height;
    private double base;
    private double sideA, sideB, sideC;
    private static int totalCount = 0;

    {
        totalCount++;
    }

    public Triangle(double h, double b, double s1, double s2, double s3){
        height = h;
        base = b;
        sideA = s1;
        sideB = s2;
        sideC = s3;
        calcPerimeter();
        calcSA();
        setName();
    }

    public void calcPerimeter() {
       perimeter = sideA + sideB + sideC;
    }

    public void calcSA() {
        SA = (height * base) / 2;
    }

    public void setName() {
        if(sideC == sideA && sideA == sideB){
            name = "equilateral";
        }
        else if(sideC == sideA || sideA == sideB || sideC == sideB){
            name = "isosceles";
        }
        else{
            name = "scalene";
        }
    }

    @Override
    public int getTotalCount() {
        return totalCount;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", SA=" + SA +
                '}';
    }


    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        totalCount++;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

}
