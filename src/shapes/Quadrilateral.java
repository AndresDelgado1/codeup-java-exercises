package shapes;

abstract class Quadrilateral implements Measurable  {
    protected int length;
    protected int width;

    public Quadrilateral(){

    }

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}
