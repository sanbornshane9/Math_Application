package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public abstract class Shape implements Serializable {

    protected String name;
    protected double perimeter;
    protected double SA;

    protected abstract void calcPerimeter();

    protected abstract void calcSA();

    protected abstract void setName();

    public abstract String toString();

    public abstract int getTotalCount();

    public String getName(){
        return name;
    }

    public double getPerimeter(){
        calcPerimeter();
        return perimeter;
    }

    public double getSA(){
        calcSA();
        return SA;
    }

}
