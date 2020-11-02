package comparator;

import models.Shape;

import java.util.Comparator;

public class SAComparator implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        if(o1.getSA() > o2.getSA()){
            return 1;
        }
        else if(o1.getSA() < o2.getSA()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
