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
    }
}