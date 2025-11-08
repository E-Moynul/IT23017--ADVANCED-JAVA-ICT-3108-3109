//it23017
abstract class Shape {
    
    protected String color = "Red";

    public abstract double calculateArea();

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Rectangle extends Shape {
    
    double width = 10;
    double height = 5;

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class DrawingApp {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();
        
        double area = rect.calculateArea();
        System.out.println("Rectangle Area: " + area);
        
        rect.displayColor();
    }
}
