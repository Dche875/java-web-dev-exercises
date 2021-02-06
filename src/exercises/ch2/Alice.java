package exercises.ch2;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice without pictures or conversation?";
        //System.out.println(sentence);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term: ");
        String word = input.nextLine();

        String sentenceLower = sentence.toLowerCase();
        String wordLower = word.toLowerCase();

        boolean compare = sentenceLower.contains(wordLower);
        System.out.println(compare);
    }
}


