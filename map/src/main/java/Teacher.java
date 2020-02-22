import java.lang.reflect.Array;
import java.util.*;

public class Teacher {
    private String name;
    private HashMap<Integer, ArrayList<Student>> students;

    public Teacher() {
    }

    public Teacher(String name, HashMap<Integer, ArrayList<Student>> students) {
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
            for (int i : students.keySet()) {
                if (student.getAge() == i) {
                    students.get(i).add(student);
                }
            }
        } else {
            students.put(student.getAge(), new ArrayList<>(Collections.singletonList(student)));
        }
    }
}
