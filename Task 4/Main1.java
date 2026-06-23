interface Shape{
    double calculateArea();

}
class Rectangle implements Shape{
     double length;
     double width;
     Rectangle(double length,double width){
        this.length= length;
        this.width = width;
     }
     @Override
public double calculateArea(){
    return length * width;


  
}

}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
        @Override
        public double calculateArea(){
            return Math.PI*radius*radius;

        }


    
}
public class Main1{
    public double calculateTotalArea(Shape[] shapes){
        double totalArea = 0;
        for(Shape shape : shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5,4),
            new Circle(3)

        };
        Main1 calculator = new Main1();
        System.out.println("total Area: "+ calculator.calculateTotalArea(shapes));
    }
}

