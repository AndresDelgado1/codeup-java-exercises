package shapes;

import static java.lang.Math.PI;

public class Circle {
    private int radius;
    public int area;
    public int circumference;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getArea(){
        return area = (int) (PI * (radius * radius));
    }

    public int getCircumference(){
        return circumference = (int) (2 * PI * radius);
    }

}
