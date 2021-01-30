package Assignment0;

public class Circle extends Shape{
    private double radius;

    public Circle(){}

    public Circle(String circleName){
        super(circleName);      
    }

    public void setDimensions(double radius){
        this.radius = radius;
    }

    @Override
    public void printDimensions(){
        System.out.println("Circle Radius is: " + radius);
    }

    @Override
    public double getArea(){
        // pi * r^2
        return Math.PI * (Math.pow(radius, 2)) ; 
    }
    
    
}
