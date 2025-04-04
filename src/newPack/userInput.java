package newPack;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("What is your name ?");
        String nameUser = in.nextLine();

        System.out.println("What's your age?");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("What's your skinTone? ");
        String skinTone = in.nextLine();

        System.out.println("What's your height");
        int height = in.nextInt();

    }
}
