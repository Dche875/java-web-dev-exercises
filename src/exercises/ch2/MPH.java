package exercises.ch2;

import java.util.Scanner;
public class MPH {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        float miles = input.nextFloat();

        System.out.println("Gallons of gas consumed: ");
        float gas = input.nextFloat();

        float mpg = miles/gas;
        System.out.println(mpg);
    }
}
