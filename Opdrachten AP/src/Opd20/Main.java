package Opd20;

public class Main {
    public static void main(String[] arg) {
        Point point1 = new Point(0,0);
        Point point2 = new Point(8,8);
        Line line1 = new Line(point1, point2);
        System.out.println(Draw.drawline(line1, 0.5));
    }
}
