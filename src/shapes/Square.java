package shapes;

 public class Square extends Rectangle {
//

     public Square(int sides){
         super(sides, sides);
//         this.sides = sides;
     }

     public int getPerimeter(){
         return 4 * length;
     }

     public int getArea(){
         return length * width;
     }

     public void setLength(int side){
         this.length = side;
     }

     public void setWidth(int side){
         this.width = side;
     }
}
