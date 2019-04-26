package Opd11;

public class Main {
    public static void main(String[] arg) {
        Students reinier = new Students(22, "Reinier");
        Students jaap = new Students(18, "Jaap");
        Students piet = new Students(21, "Piet");
        reinier.setMarks(new double[]{1, 2, 3, 5, 7, 9, 9.5});
        jaap.setMarks(new double[]{3, 4, 5});
        piet.setMarks(new double[]{10, 10, 10});

        Classes aai = new Classes("AAI");
        aai.addStudents(reinier);
        aai.addStudents(jaap);
        aai.addStudents(piet);
        double average_class_mark = aai.getAvgMark();
    }
}
