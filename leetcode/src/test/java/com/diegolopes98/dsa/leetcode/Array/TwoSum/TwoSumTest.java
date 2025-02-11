package com.diegolopes98.dsa.leetcode.Array.TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TwoSumTest {

    static Stream<Arguments> provideImplementations() {
        return Stream.of(
                Arguments.of(new TwoSumHashMapTwoPassImpl()),
                Arguments.of(new TwoSumHashMapOnePassImpl())
        );
    }

    @ParameterizedTest
    @MethodSource("provideImplementations")
    void givenAnArrayWithNumbersMatchingTargetSumAtBeginning_whenCallingTwoSum_shouldReturnNumbersIndexes(
            TwoSum solution
    ) {
        final var givenNumbers = new int[]{-1, 0, 1, 2, 3, 4, 5};
        final var givenTarget = -1;
        final var expectedOutput = new int[]{0, 1};

        final var actualOutput = solution.twoSum(givenNumbers, givenTarget);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }


    @ParameterizedTest
    @MethodSource("provideImplementations")
    void givenAnArrayWithNumbersMatchingTargetSumAtEnd_whenCallingTwoSum_shouldReturnNumbersIndexes(
            TwoSum solution
    ) {
        final var givenNumbers = new int[]{-1, 0, 1, 2, 3, 4, 5};
        final var givenTarget = 9;
        final var expectedOutput = new int[]{5, 6};

        final var actualOutput = solution.twoSum(givenNumbers, givenTarget);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @ParameterizedTest
    @MethodSource("provideImplementations")
    void givenAnArrayWithNumbersMatchingTargetSumAtMiddle_whenCallingTwoSum_shouldReturnNumbersIndexes(
            TwoSum solution
    ) {
        final var givenNumbers = new int[]{-1, 2, 3, 5};
        final var givenTarget = 5;
        final var expectedOutput = new int[]{1, 2};

        final var actualOutput = solution.twoSum(givenNumbers, givenTarget);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @ParameterizedTest
    @MethodSource("provideImplementations")
    void givenAnArrayWithNumbersMatchingTargetSumAtBorders_whenCallingTwoSum_shouldReturnNumbersIndexes(
            TwoSum solution
    ) {
        final var givenNumbers = new int[]{-1, 0, 1, 2, 3, 4, -1};
        final var givenTarget = -2;
        final var expectedOutput = new int[]{0, 6};

        final var actualOutput = solution.twoSum(givenNumbers, givenTarget);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}