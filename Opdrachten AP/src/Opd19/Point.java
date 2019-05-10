package Opd19;

public class Point implements Drawable{
    private int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(){
        System.out.println(this.x + "  "+ this.y);
    }
}
