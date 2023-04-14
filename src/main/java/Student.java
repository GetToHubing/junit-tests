import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    public ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int getGradeAverage() {
        int x = 0;
        for (int i : grades) {
            x += i;
        }
        return x / grades.size();
    }

    public void updateGrade(int oldGrade, int newGrade) {
        grades.set(grades.indexOf(oldGrade), newGrade);
    }

    public void deleteGrade(int grade) {
        grades.remove((Integer) grade);
    }

}
