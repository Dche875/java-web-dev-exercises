package exercises.ch2;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Hallo, wie heißt du?");

       String name = input.nextLine();
       System.out.println("Guten Tag, " + name);
    }
}
