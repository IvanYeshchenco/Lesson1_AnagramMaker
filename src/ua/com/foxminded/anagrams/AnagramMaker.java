package ua.com.foxminded.anagrams;

import java.util.StringJoiner;

public class AnagramMaker {

    public String makeAnagram(String inputText) {
        String[] wordsList = inputText.split(" ");
        StringJoiner resultJoiner = new StringJoiner(" ");
        for (int i = 0; i < wordsList.length; i++) {
            resultJoiner.add(reverseLetters(wordsList[i]));
        }
        return resultJoiner.toString();
    }

    private String reverseLetters(String input) {
        StringBuilder letters = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            if (Character.isLetter(input.charAt(i))) {
                letters.append(input.charAt(i));
            }
        }
        String result = restoreCharacters(input, letters);
        return result;
    }

    private String restoreCharacters(String input, StringBuilder resultBuilder) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                resultBuilder.insert(i, input.charAt(i));
            }
        }
        return resultBuilder.toString();
    }
}
