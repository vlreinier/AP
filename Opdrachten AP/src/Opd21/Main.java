package Opd21;

public class Main{
    public static void main(String[] arg) {
        Point point1 = new Point(0,0);
        Point point2 = new Point(8,8);
        // Lijn object maken met 2 punten
        Line line = new Line(point1, point2);

        // dit ophalen van x en y had ik ook in de applicatie kunnen plaatsen.
        int x0 = line.getBegin().getX();
        int x1 = line.getEnd().getX();
        int y0 = line.getBegin().getY();
        int y1 = line.getEnd().getY();

        // applicatie laden met x,y en ratio van hoeveelheid punten, 1 is 100%
        // Ik heb geen afronding gebruikt zoals in de vorige opdracht voor meer accuratie bij het plotten
        Grid.launchGrid(x0, y0, x1, y1, 1);
    }
}
