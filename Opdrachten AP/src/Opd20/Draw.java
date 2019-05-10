package Opd20;

public class Draw {
    public static void drawline(Line line, double ratio) {
        int x0 = line.getBegin().getX();
        int x1 = line.getEnd().getX();
        int y0 = line.getBegin().getY();
        int y1 = line.getEnd().getY();

        for (int i = 1; i < 10 * ratio; i++) {
            double x = x0 + (i / 10.0) * (x1 - x0);
            double y = y0 + (i / 10.0) * (y1 - y0);
            System.out.println((long)x + " " + (long)y);
        }
    }
}
