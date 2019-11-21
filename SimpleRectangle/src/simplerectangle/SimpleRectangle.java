package simplerectangle;

/**
 * @author Daniel Baumann
 * ID:112870711
 * Sect Number: 10
 */
public class SimpleRectangle {
    //declare height and width variables
    double height;
    double width;
    public static void main(String[] args) {
        //make rectangle objects with specified height and width values
        SimpleRectangle rectangle1 = new SimpleRectangle(40, 4);
        SimpleRectangle rectangle2 = new SimpleRectangle(35.9, 3.5);
        
        //display stored rectangle object data and calculated area and perimeter values
        System.out.println("Rectangle 1");
        System.out.println("-------------------");
        System.out.println("    Width: " + rectangle1.width);
        System.out.println("   Height: " + rectangle1.height);
        System.out.println("     Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println();
        System.out.println("Rectangle 2");
        System.out.println("-------------------");
        System.out.println("    Width: " + rectangle2.width);
        System.out.println("   Height: " + rectangle2.height);
        System.out.println("     Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
    //no-arg constructor creates default rectangle object
    SimpleRectangle(){
        height = 1;
        width = 1;
    }
    //constructor creates rectangle object with specified height and width values
    SimpleRectangle(double newHeight, double newWidth){
        height = newHeight;
        width = newWidth;
    }
    //getter method used for calculating area
    double getArea(){
        return height * width;
    }
    //getter method used for calculating perimeter
    double getPerimeter(){
        return (height * 2) + (width * 2);
    }
}
