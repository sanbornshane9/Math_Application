package comparator;

import models.Shape;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        if(o1.getPerimeter() > o2.getPerimeter()){
            return 1;
        }
        else if(o1.getPerimeter() < o2.getPerimeter()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
