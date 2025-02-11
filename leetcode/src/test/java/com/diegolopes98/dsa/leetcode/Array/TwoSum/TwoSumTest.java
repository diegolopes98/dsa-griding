package com.diegolopes98.dsa.leetcode.Array.TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TwoSumTest {

    private TwoSum solution;

    @BeforeAll
    void setup() {
        solution = new TwoSumHashMapTwoPassImpl();
    }

    @Test
    void givenAnArrayWithNumbersMatchingTargetSumAtBeginning_whenCallingTwoSum_shouldReturnNumbersIndexes() {
        final var givenNumbers = new int[]{-1, 0, 1, 2, 3, 4, 5};
        final var givenTarget = -1;
        final var expectedOutput = new int[]{0, 1};

        final var actualOutput = solution.twoSum(givenNumbers, givenTarget);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }


    @Test
    void givenAnArrayWithNumbersMatchingTargetSumAtEnd_whenCallingTwoSum_shouldReturnNumbersIndexes() {
        final var givenNumbers = new int[]{-1, 0, 1, 2, 3, 4, 5};
        final var givenTarget = 9;
        final var expectedOutput = new int[]{5, 6};

        final var actualOutput = solution.twoSum(givenNumbers, givenTarget);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenAnArrayWithNumbersMatchingTargetSumAtMiddle_whenCallingTwoSum_shouldReturnNumbersIndexes() {
        final var givenNumbers = new int[]{-1, 2, 3, 5};
        final var givenTarget = 5;
        final var expectedOutput = new int[]{1, 2};

        final var actualOutput = solution.twoSum(givenNumbers, givenTarget);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenAnArrayWithNumbersMatchingTargetSumAtBorders_whenCallingTwoSum_shouldReturnNumbersIndexes() {
        final var givenNumbers = new int[]{-1, 0, 1, 2, 3, 4, -1};
        final var givenTarget = -2;
        final var expectedOutput = new int[]{0, 6};

        final var actualOutput = solution.twoSum(givenNumbers, givenTarget);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}