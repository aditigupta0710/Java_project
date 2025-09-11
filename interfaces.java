interface Animal {
    public void walk() ;
}
 interface herbivore{
    
}
class Horse implements Animal , herbivore { // multiple inheritance(can be done by only interfaces)
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
