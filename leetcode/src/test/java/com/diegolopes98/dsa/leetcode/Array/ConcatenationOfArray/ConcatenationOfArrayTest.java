package com.diegolopes98.dsa.leetcode.Array.ConcatenationOfArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class ConcatenationOfArrayTest {

    private ConcatenationOfArray solution;

    @BeforeAll
    void setup() {
        solution = new ConcatenationOfArrayImpl();
    }

    @Test
    void givenPopulatedArray_whenCallingGetConcatenation_shouldReturnArrayConcatenated() {
        final var givenNums = new int[]{1, 2, 3};
        final var expectedOutput = new int[]{1, 2, 3, 1, 2, 3};

        final var actualOutput = solution.getConcatenation(givenNums);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenSingleValueArray_whenCallingGetConcatenation_shouldReturnArrayConcatenated() {
        final var givenNums = new int[]{1};
        final var expectedOutput = new int[]{1, 1};

        final var actualOutput = solution.getConcatenation(givenNums);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenEmptyArray_whenCallingGetConcatenation_shouldReturnArrayConcatenated() {
        final var givenNums = new int[]{};
        final var expectedOutput = new int[]{};

        final var actualOutput = solution.getConcatenation(givenNums);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}
