class student {
    String name ;
}
public class reassign {
    public static void change(student s) {
        s = new student();
        s.name = "Aditi";
    }
    public static void main(String[] args) {
        student stu = new student();
        stu.name = "Choti";
        change(stu);
        System.out.println(stu.name);
    }
}
