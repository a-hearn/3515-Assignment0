package Assignment0;

public class EquilateralTriangle extends Triangle {
    private double side;
    private double perimeter; 

    public EquilateralTriangle(){}

    public EquilateralTriangle(String EquilateralTriangle){
        super(EquilateralTriangle);
    }

    public void setDimensions(double side){
        this.side = side;
        this.perimeter = side*3;
    }

    @Override
    public void printDimensions(){
        System.out.println("The 3 Sides Lengths each are: " + side);
    }

    @Override
    public double getArea(){
        //using provided formula area  =√ s (s-a) (s-b) (s-c) where a, b, and c are the lengths of the sides, ands = ½ the perimeter
        double s = (perimeter * (.5));
        return Math.sqrt( s * (s-side) * (s-side) * (s-side)); 
    }
}

