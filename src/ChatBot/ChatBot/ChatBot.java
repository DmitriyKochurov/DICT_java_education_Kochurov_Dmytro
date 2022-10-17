package ChatBot.ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Hello, my name is HIMARS.");
        System.out.println("I was created in 2022 year.");
        System.out.print("Please remind me your name: ");
        String x = input.next();
        System.out.println("What a great name you have," + x);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");
        int r3 = input.nextInt();
        int r5 = input.nextInt();
        int r7 = input.nextInt();
        int age = (r3 * 70 + r5 * 21 + r7 * 15) % 105;
        System.out.println("Your age is " + age + " that`s a good time to start programming!");
        System.out.println("Now i will prove to you that I can count to any number you want.");
        int c = input.nextInt();
        for(int i = 1; i <= c; i++){
            System.out.println(i + " !");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while(true){
            int y = input.nextInt();
            if(y == 2){
                System.out.println("Great, you right!");
                break;
            } else {
                System.out.println("Please, try again."
                );
            }
        }
        System.out.println("Goodbye, have a great day.");
    }
}