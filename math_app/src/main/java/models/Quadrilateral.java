package models;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Quadrilateral extends Shape{

    private double width;
    private double length;
    private static int totalCount = 0;

    {
        totalCount++;
    }

    public Quadrilateral(double w, double l){
        width = w;
        length = l;
        calcPerimeter();
        calcSA();
        setName();
    }

    public void calcPerimeter() {
        perimeter = (width + length) * 2;
    }

    public void calcSA() {
        SA = width * length;
    }

    public void setName() {
        if(width == length){
            name = "square";
        }
        else{
            name = "rectangle";
        }
    }

    @Override
    public int getTotalCount() {
        return totalCount;
    }


    @Override
    public String toString() {
        return "Quadrilateral{" +
                "width=" + width +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", SA=" + SA +
                '}';
    }


    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        totalCount++;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
