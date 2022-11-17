package shapes;

import java.awt.*;

public class Rectangle {

    public int length;

    public int width;

    public Rectangle(int rectangleLength, int rectangleWidth){

        this.length = rectangleLength;
        this.width = rectangleWidth;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }
}




