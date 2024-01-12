package Project;
import java.util.Arrays;
public class Course {
    private String courseName;
    private String[] students = new String[3];

    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if(numberOfStudents == students.length){
            increaseSize();
        }
        students[numberOfStudents] = student;

        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] existingStudents = new String[numberOfStudents];
        for(int i = 0; i < numberOfStudents; i++){
            existingStudents[i] = students[i];
        }
        return existingStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int k = 0;
        for(int i = 0; i < numberOfStudents; i++){
            if (students[i].equalsIgnoreCase(student)){
                students[i] = null;
                k = i;
                break;
            }
        }

        for (int i = k; i < numberOfStudents - 1; i++){
            students[i] = students[i + 1];
        }

        numberOfStudents--;
    }
    public void clear(){
        Arrays.fill(students, null);
        numberOfStudents = 0;

    }
    private void increaseSize(){
        String[] overloadStudents = new String[numberOfStudents + 1];
        System.arraycopy(students, 0, overloadStudents, 0, students.length);
        students = overloadStudents;
    }
}