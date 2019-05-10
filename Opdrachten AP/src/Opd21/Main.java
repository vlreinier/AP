package Opd21;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application{
    public void start(Stage stage) {
        double ratio = 1;
        Point point1 = new Point(1,9);
        Point point2 = new Point(17,-3);
        Line line = new Line(point1, point2);
        int x0 = line.getBegin().getX();
        int x1 = line.getEnd().getX();
        int y0 = line.getBegin().getY();
        int y1 = line.getEnd().getY();
        stage.setTitle("Point Plotter");
        final NumberAxis xAxis = new NumberAxis(-15, 15, 1);
        final NumberAxis yAxis = new NumberAxis(-15, 15, 1);
        final ScatterChart<Number,Number> sc = new ScatterChart<>(xAxis,yAxis);
        xAxis.setLabel("X");
        yAxis.setLabel("Y");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Punten");
        for (int i = 1; i < 10 * ratio; i++) {
            double x = (x0 + (i / 10.0) * (x1 - x0));
            double y = (y0 + (i / 10.0) * (y1 - y0));
            System.out.println(x + "  " + y);
            series1.getData().add(new XYChart.Data(x, y));
        }
        sc.getData().addAll(series1);
        Scene scene  = new Scene(sc, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] arg) {
        launch(arg);
    }
}
