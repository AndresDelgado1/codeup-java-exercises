package shapes;

import java.awt.*;

public class Rectangle {

    public int length;

    public int width;

    public Rectangle(int rectangleLength, int rectangleWidth){

        length = rectangleLength;
        width = rectangleWidth;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }
}




