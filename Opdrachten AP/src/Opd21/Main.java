package Opd21;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main{
    public static void main(String[] arg) {
        // Ik heb geen afronding gebruikt zoals in de vorige opdracht voor meer accuratie bij het plotten
        Point point1 = new Point(0,0);
        Point point2 = new Point(8,8);
        // Lijn object maken met 2 punten
        Line line = new Line(point1, point2);
        // Applicatie laden met argumenten lijn en ratio.
        Grid.launchGrid(line, 1);
    }
}
