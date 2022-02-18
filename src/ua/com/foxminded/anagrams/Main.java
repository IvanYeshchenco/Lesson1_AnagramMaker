package ua.com.foxminded.anagrams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input our words:");
        String inputData = scanner.nextLine();

        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputData);
        System.out.println(reverseResult);
    }
}
