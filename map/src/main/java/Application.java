import java.util.*;

public class Application {

  public static void main(String[] args) {
    Student student1 = new Student("Linda", 18);
    Student student2 = new Student("Cindy", 19);
    Student student3 = new Student("Mary", 19);
    Student student4 = new Student("Ben", 19);
    Student student5 = new Student("Solider", 20);
    HashMap<Integer, ArrayList<Student>> students = new HashMap<>();
    students.put(18, new ArrayList<>(Collections.singletonList(student1)));
    students.put(19, new ArrayList<>(Arrays.asList(student2, student3)) );

    Teacher teacher = new Teacher("Bob", students);
    System.out.println(teacher);
    System.out.println("===============================");

    teacher.addStudent(student4);
    System.out.println(teacher);
    System.out.println("===============================");

    teacher.addStudent(student5);
    System.out.println(teacher);
  }

}
