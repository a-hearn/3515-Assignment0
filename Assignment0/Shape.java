package Assignment0;

public class Shape {
    private String name;
    public Shape(){
    }

    public Shape(String name){
        this.name = name;
    }

    /** returns the name of the shape */
    public String getName(){
        return name;
    }

    /** returns the area of the shape */
    public double getArea(){
        return 0.0;
    }

    /** returns the dimension of the shape */
    public void printDimensions(){
        System.out.println("No Dimensions");
    } 
}
