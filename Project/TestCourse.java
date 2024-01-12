package Project;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("«Основы программирования»");
        Course course2 = new Course("«Объектно-ориентированное программирование»");
        Course course3 = new Course("Статистическая физика");

        course1.addStudent("Петр Иванович Н.");
        course1.addStudent("Борис Сергеевич П.");
        course1.addStudent("Анна Дмитриевна К.");

        course2.addStudent("Петр Иванович Н.");
        course2.addStudent("Анна Сергеевна Д.");

        course3.addStudent("Александр Артурович  Б.");
        course3.addStudent("Георгий Ильич С.");
        course3.addStudent("Ирина Владиславовна В.");
        course3.addStudent("Павел Германович К.");
        course3.addStudent("Никита Сергеевич С.");

        System.out.println("Количество студентов по дисциплине\n"
                + course3.getCourseName() + ": " + course3.getNumberOfStudents());
        String[] students = course3.getStudents();
        int i = 0;
        for (i = 0; i < course3.getNumberOfStudents(); i++) {
            System.out.print(students[i]);
            if (i < course3.getNumberOfStudents() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nУдаляем студента Ирину\n");

        course3.dropStudent("Ирина Владиславовна В.");
        System.out.println("Количество студентов по дисциплине\n"
                + course3.getCourseName() + ": " + course3.getNumberOfStudents());
        students = course3.getStudents();
        for (i = 0; i < course3.getNumberOfStudents(); i++) {
            System.out.print(students[i]);
            if (i < course3.getNumberOfStudents() - 1) {
                System.out.print(", ");
            }
        }



        /*System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Количество студентов по дисциплине\n"
                + course2.getCourseName() + ": " + course2.getNumberOfStudents());*/
    }
}