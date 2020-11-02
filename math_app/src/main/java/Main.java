import comparator.PerimeterComparator;
import comparator.SAComparator;
import models.Circle;
import models.Quadrilateral;
import models.Shape;
import models.Triangle;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        ArrayList<Shape> allShapes = new ArrayList<Shape>();

        Shape circle = new Circle(5);
        allShapes.add(circle);
        Shape eqTri = new Triangle(5,5,5,5,5);
        allShapes.add(eqTri);
        Shape isosTri = new Triangle(5,5,5,5,8);
        allShapes.add(isosTri);
        Shape scalTri = new Triangle(5,5,5,6,7);
        allShapes.add(scalTri);
        Shape square = new Quadrilateral(5,5);
        allShapes.add(square);
        Shape rect = new Quadrilateral(5,8);
        allShapes.add(rect);

        System.out.println("Checking names:");
        for(Shape s : allShapes){
            System.out.println("name: " + s.getName());
        }
        System.out.println();

        Collections.sort(allShapes,new SAComparator());
        System.out.println("After Sorted By SA:");
        for(Shape s : allShapes){
            System.out.println("SA: " + s.getSA());
        }
        System.out.println();

        Collections.sort(allShapes, new PerimeterComparator());
        System.out.println("After Sorted By Perimeter:");
        for(Shape s : allShapes){
            System.out.println("Perimeter: " + s.getPerimeter());
        }
        System.out.println();

        Shape newCircle = null;
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tmp/shape.txt"));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("tmp/shape.txt"));
        ){
            out.writeObject(circle);
            newCircle = (Shape) in.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Circle object that was created in main with constructor");
        System.out.println(circle);
        System.out.println();
        System.out.println("Circle object deserialized from tmp/shape.txt:");
        System.out.println(newCircle);
        System.out.println();

        System.out.println("Showing count of how many objects of each class are in memory:");
        for(Shape s : allShapes){
            System.out.println(s.getName() + ": " + s.getTotalCount());
        }




    }
}
