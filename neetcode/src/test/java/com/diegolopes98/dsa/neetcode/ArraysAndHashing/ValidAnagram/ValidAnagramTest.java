package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ValidAnagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class ValidAnagramTest {

    private ValidAnagram solution;

    @BeforeAll
    void setup() {
        solution = new ValidAnagramImpl();
    }

    @Test
    public void givenTwoValidAnagramsWords_whenCallingIsAnagram_shouldReturnTrue() {
        final var givenS = "sword";
        final var givenT = "words";

        final var actualOutput = solution.isAnagram(givenS, givenT);

        Assertions.assertTrue(actualOutput);
    }

    @Test
    public void givenTwoValidAnagramsSequenceOfLetters_whenCallingIsAnagram_shouldReturnTrue() {
        final var givenS = "abcde";
        final var givenT = "edcba";

        final var actualOutput = solution.isAnagram(givenS, givenT);

        Assertions.assertTrue(actualOutput);
    }

    @Test
    public void givenTwoInValidAnagramsWithSameSize_whenCallingIsAnagram_shouldReturnFalse() {
        final var givenS = "1234";
        final var givenT = "123A";

        final var actualOutput = solution.isAnagram(givenS, givenT);

        Assertions.assertFalse(actualOutput);
    }

    @Test
    public void givenTwoInValidAnagramsWithDiffSize_whenCallingIsAnagram_shouldReturnFalse() {
        final var givenS = "1234";
        final var givenT = "12345";

        final var actualOutput = solution.isAnagram(givenS, givenT);

        Assertions.assertFalse(actualOutput);
    }
}