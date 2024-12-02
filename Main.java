import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

   void  number(int age){
        if (age<=12){
            System.out.println("you are under 13");
        } else if (age<=19) {
            System.out.println("you are an teenager");
        } else {
            System.out.println("you are an adult");
        }
    }
    public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);

       Main user=new Main();
        System.out.print("Enter your age: ");
       int userAge=scanner.nextInt();

       user.number(userAge);

        }
    }