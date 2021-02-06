package exercises.ch2;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle length: ");
        float length = input.nextFloat();

        System.out.println("Enter rectangle width: ");
        float width = input.nextFloat();

        float result = length * width;
        System.out.println(result);
    }
}
