package c1.syntax_and_structure.m6.objects;

// Representation or blueprint of a rectangle
public class Rectangle {
    //fields
    private double length;
    private double width;

    //methods of the object
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }

    //setter and getter
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
