package ChatBot.ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Hello, my name is HIMARS.");
        System.out.println("I was created in 2022 year.");
        System.out.print("Please remind me your name: ");
        String x = input.next();
        input.close();
        System.out.println("What a great name you have," + x);
    }
}