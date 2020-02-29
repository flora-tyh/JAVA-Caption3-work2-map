import java.lang.reflect.Array;
import java.util.*;

public class Teacher {
    private String name;
    private HashMap<Integer, Set<Student>> students;

    public Teacher() {
    }

    public Teacher(String name, HashMap<Integer, Set<Student>> students) {
        this.name = name;
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : students.keySet()) {
            stringBuilder.append("age : " + i).append(" name : " + students.get(i)).append("\n");
        }
        return String.format("I am a teacher. My name is %s \n I have students \n", name) + stringBuilder;
    }

    public void addStudent(Student student) {
        if (students.containsKey(student.getAge())) {
             students.get(student.getAge()).add(student);
        } else {
            Set<Student> stu = new HashSet<>();
            stu.add(student);
            students.put(student.getAge(), stu);
        }
    }
}
