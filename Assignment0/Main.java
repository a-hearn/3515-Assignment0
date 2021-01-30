package Assignment0;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialize a scanner
        Scanner console = new Scanner(System.in);

        //Create an instance of each class
        Square s = new Square("Square");
        Circle c = new Circle("Circle");
        Triangle t = new Triangle("Triangle");
        EquilateralTriangle et = new EquilateralTriangle("ETriangle");

        //Prompt user to enter dimensions for each object and set dimensions accordingly
        //Square
        System.out.println("Enter Length For Square.");
        double squareLength = console.nextDouble();
        System.out.println("Enter Height For Square.");
        double squareHeight = console.nextDouble();
        s.setDimensions(squareLength, squareHeight);
        
        //Circle
        System.out.println("Enter Radius For Circle.");
        double circleRadius = console.nextDouble();
        c.setDimensions(circleRadius);
        
        //Triangle
        System.out.println("Enter Side Length 1 For Triangle.");
        double triangleSide1 = console.nextDouble();
        System.out.println("Enter Side Length 2 For Triangle.");
        double triangleSide2 = console.nextDouble();
        System.out.println("Enter Side Length 3 For Triangle.");
        double triangleSide3 = console.nextDouble();
        t.setDimensions(triangleSide1,triangleSide2,triangleSide3);

        //ETriangle
        System.out.println("Enter Side Length For Equilateral Triangle.");
        double eTriangleSide = console.nextDouble();
        et.setDimensions(eTriangleSide);

        //Print out info Accordingly
        //Square name, area, dimensions
        System.out.println("Square Name is: " + s.getName());
        System.out.println("Square Area is: " + s.getArea());
        s.printDimensions();
        System.out.println("");

        //Circle name, area, dimensions
        System.out.println("Circle Name is: " + c.getName());
        System.out.println("Circle Area is: " + c.getArea());
        c.printDimensions();
        System.out.println("");

        //Triangle name, area, dimensions
        System.out.println("Triangle Name is: " + t.getName());
        System.out.println("Triangle Area is: " + t.getArea());
        t.printDimensions();
        System.out.println("");
        
        //Eqilateral Triangle name, area, dimensions
        System.out.println("Equilateral Triangle Name is: " + et.getName());
        System.out.println("Equilateral Triangle Area is: " + et.getArea());
        et.printDimensions();

        console.close();

        



        




    }
}
