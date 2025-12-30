import java.util.Scanner;
public class nestedifelse {
public static void main(String[] args) {
    int passingmarks,marksobtained;
    char grade;
    passingmarks = 40;

    Scanner input = new Scanner(System.in);
    
    System.out.println("enter the marks you got:");
    marksobtained = input.nextInt();

    if(marksobtained >= passingmarks) {
        if (marksobtained > 90)
        grade = 'A';
        else if(marksobtained > 75)
        grade = 'B';
        else if(marksobtained > 60)
        grade = 'C';
        else
        grade = 'D';

        System.out.println("you passed the exam..and your grade is" +grade);

    }
else{
    grade = 'F';
    System.out.println("you failed the exam and your grade is: " +grade);
}
}
}
