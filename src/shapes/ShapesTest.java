package shapes;



public class ShapesTest {
    public static void main(String[] args){
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area of rectangle is: " + box1.getArea() + " perimeter of recangle is: " + box1.getPerimeter());


        Rectangle box2 = new Square(5);
        System.out.println("Area of square is: " + box2.getArea() + " perimeter of square is: " + box2.getPerimeter());


    }
}
