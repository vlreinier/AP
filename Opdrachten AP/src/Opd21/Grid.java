package Opd21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

// ik heb gekozen voor het gebruik van JavaFX application voor de GUI. Ik extend hier de class Application
public class Grid extends Application {
    private static Line line;
    private static double ratio;

    // Ik had na even zoeken deze truck gevonden om de applicatie via een statische functie met argumenten
    // line en ratio op te roepen
    public static void launchGrid(Line line, double ratio){
        Grid.line = line;
        Grid.ratio = ratio;
        Application.launch(Grid.class);
    }

    // Functie start is een vereiste functie voor extended class Application
    // Hier wordt stage, de GUI opgezet en getoond
    @Override
    public void start(Stage stage) {
        // Ophalen x en y van punten lijn
        int x0 = line.getBegin().getX();
        int x1 = line.getEnd().getX();
        int y0 = line.getBegin().getY();
        int y1 = line.getEnd().getY();

        stage.setTitle("Point Plotter"); // titel GUI
        // opzetten grid met lengte x en y, gebruik makend van class NumberAxis
        final NumberAxis xAxis = new NumberAxis(-15, 15, 1);
        final NumberAxis yAxis = new NumberAxis(-15, 15, 1);
        // ScatterChart datatype voor het opslaan van de punten
        final ScatterChart<Number,Number> sc = new ScatterChart<>(xAxis,yAxis); // create empty point diagram
        xAxis.setLabel("X"); // name X axis
        yAxis.setLabel("Y"); // name Y axis

        XYChart.Series serie = new XYChart.Series(); // XYChart class static function Series serie creeren.

        serie.setName("Punten");
        for (int i = 1; i < 10 * ratio; i++) {
            double x = (x0 + (i / 10.0) * (x1 - x0));
            double y = (y0 + (i / 10.0) * (y1 - y0));
            System.out.println(x + "  " + y);
            serie.getData().add(new XYChart.Data(x, y)); // punt met x en y toevoegen aan serie
        }
        sc.getData().addAll(serie); // serie aan scatterchart toevoegen
        Scene scene  = new Scene(sc, 800, 600); //  scatterchart aan nieuwe scene toevoegen
        stage.setScene(scene); // scene aan object stage toevoegen
        stage.show(); // stage, GUI tonen
    }
}