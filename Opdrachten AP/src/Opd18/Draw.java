package Opd18;

public class Draw {
    public static String drawline(double x0, double y0,double x1, double y1, double ratio) {
        double dx, dy, x, y;
        String coordinates = "";
        dx = x1 - x0;
        dy = y1 - y0;

        for (int i = 1; i < 10 * ratio; i++) {
            x = x0 + (i / 10.0) * dx;
            y = y0 + (i / 10.0) * dy;
            coordinates += (long)x + " " + (long)y + "\n";
        }
        return coordinates;
    }
}
