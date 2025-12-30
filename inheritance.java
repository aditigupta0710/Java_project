class Shape {
    public void area() {
        System.out.println("display area : ");
    }
}
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class circle extends Shape {
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

public class inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.area(4, 6);

        
    }
}