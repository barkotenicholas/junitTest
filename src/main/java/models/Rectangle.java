package models;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length,  int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSquare(){
        return length == width;
    }
}
