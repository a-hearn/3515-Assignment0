package Assignment0;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double perimeter; 

    public Triangle(){}

    public Triangle(String Triangle){
        super(Triangle);
    }

    public void setDimensions(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
        this.perimeter = s1 + s2 + s3;
    }

    @Override
    public void printDimensions(){
        System.out.println("Side 1 Length is: " + side1);
        System.out.println("Side 2 Length is: " + side2);
        System.out.println("Side 3 Length is: " + side3);
    }

    @Override
    public double getArea(){
        //using provided formula area  =√ s (s-a) (s-b) (s-c) where a, b, and c are the lengths of the sides, ands = ½ the perimeter
        double s = (perimeter * (.5));
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3)); 
    }
}

