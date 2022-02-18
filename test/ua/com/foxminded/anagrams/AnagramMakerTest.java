package ua.com.foxminded.anagrams;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AnagramMakerTest {

    @Test
    void makeAnagramShouldReturnEmptyStringWhenInputEmptyString() {
        String inputString = "";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        Assert.assertEquals(reverseResult, inputString);
    }

    @Test
    void makeAnagramShouldReturnEmptyStringWhenInputSpace() {
        String inputString = " ";
        String actual = "";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        Assert.assertEquals(reverseResult, actual);
    }

    @Test
    void makeAnagramShouldReturnEmptyStringWhenInputMultiSpace() {
        String inputString = "   ";
        String actual = "";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        Assert.assertEquals(reverseResult, actual);
    }

    @Test
    void makeAnagramShouldReturnLetterWhenInputLetter() {
        String inputString = "a";
        String actual = "a";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        Assert.assertEquals(reverseResult, actual);
    }

    @Test
    void makeAnagramShouldReturnMultipleOfSameLetterWhenInputMultipleOfSameLetter() {
        String inputString = "aaaaaa";
        String actual = "aaaaaa";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        Assert.assertEquals(reverseResult, actual);
    }

    @Test
    void makeAnagramShouldReturnReverseOnlyLowerCaseLettersWhenInputOnlyLowerCaseLetters() {
        String inputString = "abcde";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        StringBuilder reverseExpected = new StringBuilder(inputString).reverse();
        String result = reverseExpected.toString();
        Assert.assertEquals(reverseResult, result);
    }

    @Test
    void makeAnagramShouldReverseDifferentRegistriesWhenInputDifferentRegistries() {
        String inputString = "aAaAAa";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        StringBuilder reverseExpected = new StringBuilder(inputString).reverse();
        String result = reverseExpected.toString();
        Assert.assertEquals(reverseResult, result);
    }

    @Test
    void makeAnagramShouldJustSymbolsWhenInputJustSymbols() {
        String inputString2 = "123456!@#$%^";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString2);
        Assert.assertEquals(inputString2, reverseResult);
    }

    @Test
    void makeAnagramShouldReverseLettersAndNotReverseSymbolsWhenInputLettersAndSymbols() {
        String inputString = "a12dc3d4e";
        String actual = "e12dc3d4a";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        Assert.assertEquals(reverseResult, actual);
    }

    @Test
    void makeAnagramShouldReverseMultipleWordsWhenInputMultipleWords() {
        String inputString = "abcd efgh";
        String actual = "dcba hgfe";
        AnagramMaker anagramMaker = new AnagramMaker();
        String reverseResult = anagramMaker.makeAnagram(inputString);
        Assert.assertEquals(reverseResult, actual);
    }

}
