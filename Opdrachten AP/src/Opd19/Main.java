package Opd19;

public class Main {
    public static void main(String[] arg) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,3);
        Line l1 = new Line(p1, p2);

        p1.draw();
        p2.draw();
        l1.draw();
    }
}
