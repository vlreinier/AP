package Opd19;

import Opd18.Draw;

public class Line implements Drawable{
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public void draw(){
        System.out.println(begin.getX() + "," + begin.getY() + "  " + this.end.getX() + "," + this.end.getY());
    }
}
