import java.util.ArrayList;
class Student {
    String name;
    int marks;
     
    Student(String name , int marks) {
        this.name = name;
        this.marks = marks;

    }
}

public class example {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Aditi", 85));
        students.add(new Student("Rohit", 92));
        students.add(new Student("Sneha", 78));

        System.out.println("Student list : ");
        for(Student s : students) {
            System.out.println(s.name + " - "  + s.marks + " marks ");
        }
    }
}