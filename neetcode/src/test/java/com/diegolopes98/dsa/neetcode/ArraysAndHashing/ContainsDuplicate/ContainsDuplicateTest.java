package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ContainsDuplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class ContainsDuplicateTest {

    private ContainsDuplicate solution;

    @BeforeAll
    public void setup() {
        solution = new ContainsDuplicateImpl();
    }

    @Test
    public void givenDuplicateNeighboursAtEnd_whenCallHasDuplicate_shouldReturnTrue() {
        final var givenNumbers = new int[]{0, 1, 2, 2};

        final var result = solution.hasDuplicate(givenNumbers);

        Assertions.assertTrue(result);
    }

    @Test
    public void givenDuplicateNeighboursAtBegin_whenCallHasDuplicate_shouldReturnTrue() {
        final var givenNumbers = new int[]{0, 0, 1, 2};

        final var result = solution.hasDuplicate(givenNumbers);

        Assertions.assertTrue(result);
    }

    @Test
    public void givenDuplicateNeighboursAtMiddle_whenCallHasDuplicate_shouldReturnTrue() {
        final var givenNumbers = new int[]{0, 1, 1, 2};

        final var result = solution.hasDuplicate(givenNumbers);

        Assertions.assertTrue(result);
    }

    @Test
    public void givenDuplicateAtBeginAndEnd_whenCallHasDuplicate_shouldReturnTrue() {
        final var givenNumbers = new int[]{-1, 0, 1, 2, -1};

        final var result = solution.hasDuplicate(givenNumbers);

        Assertions.assertTrue(result);
    }

    @Test
    public void givenNoDuplicates_whenCallHasDuplicate_shouldReturnFalse() {
        final var givenNumbers = new int[]{0, 1, 2};

        final var result = solution.hasDuplicate(givenNumbers);

        Assertions.assertFalse(result);
    }
}
