package Assignment0;

public class Square extends Shape {
    private double length;
    private double height;
    
    public Square(){}

    public Square(String squareName){
        super(squareName);      
    }

    public void setDimensions(double length, double height){
        this.length = length;
        this.height = height;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Square Length is: " + length);
        System.out.println("Square Height is: " + height);
    }

    @Override
    public double getArea(){
        // s^2 or side * side 
        return (height * length);  
    }
}

