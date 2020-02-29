import java.util.*;

public class Application {

  public static void main(String[] args) {
    Student student1 = new Student("Linda", 18);
    Student student2 = new Student("Cindy", 19);
    Student student3 = new Student("Mary", 19);
    Student student4 = new Student("Ben", 19);
    Student student5 = new Student("Solider", 20);
    HashMap<Integer, Set<Student>> students = new HashMap<>();
    Set<Student> stu1 = new HashSet<Student>();
    stu1.add(student1);
    Set<Student> stu2 = new HashSet<Student>();
    stu2.add(student2);
    stu2.add(student3);
    students.put(18, stu1);
    students.put(19, stu2);

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
