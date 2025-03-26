import java.util.ArrayList;

public class StudentInfoSystem {
    private static ArrayList<Student> students = new ArrayList<>();

    // Task 1: Add new student
    static boolean addStudent(Student student) {
        if (student == null || student.getName() == null || student.getName().isEmpty()) {
            System.out.println("Invalid student details.");
            return false;
        }

        students.add(student); // Add to ArrayList
        System.out.println("Student added: " + student.getName());
        return true;
    }

    // Find student by name
    static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
}
