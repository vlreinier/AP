package Opd11;
import java.util.ArrayList;
import static java.lang.StrictMath.round;

public class Classes {
    private String name;
    private ArrayList<Students> students = new ArrayList<>();
    private ArrayList<String> teachers = new ArrayList<>();

    public Classes(String name){
        this.name = name;
    }

    public void addStudents(Students student) {
        this.students.add(student);
    }

    public void addTeachers(String teacher) {
        this.teachers.add(teacher);
    }

    public double getAvgMark() {
        double avg = 0;
        for (Students student : students){
            avg = avg + student.getAvgMarks();
        }
        return round((avg / students.size()) * 100.0) / 100.0;
    }
}