package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args){
        //1. Write a static method to find the sum of all the even numbers in an ArrayList.
        //   Within main, create a list with at least 10 integers and call your method on the list.

        //ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ///                                                            ^^^^

        /* Instead of using the .add() method, we can initialize all of this within one line:
        Short way: the 'new ArrayList<>();' on the right hand side of the assignment operator can
        use the helper class called 'Arrays'. Then we can call the method within it called '.asList()'
        inside we can place the set of numbers we want to initialize into our ArrayList*/


        /*Long way: another way to add 10 integers to ArrayList would be to use the .add() method:
        numbersToSum.add(1);
        numbersToSum.add(2);
        numbersToSum.add(3);
        numbersToSum.add(4);
        numbersToSum.add(5);
        numbersToSum.add(6);
        numbersToSum.add(7);
        numbersToSum.add(8);
        numbersToSum.add(9);
        numbersToSum.add(10);
        However this takes up 10 lines of code and is time consuming! */

        //Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
        //System.out.println("The sum is: " + theSum.toString()); //.toString() is a built in method in Java that returns
        // the value given to it in string format. Any object that this method is applied on will be returned as a string object.

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitAGivenString();

        //2. Write a static method to print out each word in a list that has exactly 5 letters
        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));
        System.out.println("What word length are you looking for: ");

        Integer searchLength = ArrayListPractice.getUserSearchInput(); //3. Modify your code to prompt the user to enter the word length for the search.
        ArrayListPractice.printWordsWithFiveLetters(wordsToSearch, searchLength); //After creating ArrayList, we need to call to the method! This method is static so we need to call to the ArrayListPractice class directly to call this this method.
    }
    //returns integer
    public static Integer getUserSearchInput() {
        Scanner scanner = new Scanner(System.in);
        Integer myUsersInt = scanner.nextInt();
        scanner.close();
        return myUsersInt;
    }
    //doesn't return just prints
    public static void printWordsWithFiveLetters(ArrayList<String> words, Integer searchLength) {
        for(int i = 0; i < words.size(); i ++) {
            if (words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }





    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum) {
        //Objective: get sum fo all even numbers

        /*We need to remember that in a for loop, everytime it loops through and goes back to the top,
        //it forgets whatevers within itself. But the sum is something we need to remember! We need to
        //remember 2, then 2+4, then 2+4+6, etc.

        When we want to remember that value (the sum) as it continues to loop, we have to create a variable outside
        the for loop so it remembers! When we create the variable it needs to be the correct type.

        We will use 'Integer' and create the variable name as 'sum'. Then we will initialize it to 0 because in the
        case that we don't have any even numbers the value would be 0.*/
        Integer sum = 0;
        for (int i = 0; i < valuesToSum.size(); i++) {
            //How do we check if a number is even?
            if (valuesToSum.get(i) % 2 == 0){
                sum = sum + valuesToSum.get(i); //grabs the value and adds that to whatever previous sum and reassign 'sum' to that new value.
                //alternate way to write it would be: sum += valuesToSum.get(i);
            }
        }
        return sum;
    }
}
