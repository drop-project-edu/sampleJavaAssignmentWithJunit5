package org.dropProject.samples.sampleJavaAssignment;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// in Drop Project, all test classes must begin with "Test"
@TestMethodOrder(MethodOrderer.MethodName.class)
@Timeout(1)
public class TestTeacherProject {

    @Test
    public void test_001_FindMax() {
        assertEquals(7, Main.findMax(new int[] { 1, 2, 7, 4 }), "trying to find the maximum in [1,2,7,4]");
        assertEquals(4, Main.findMax(new int[] { 1, 2, 4 }), "trying to find the maximum in [1,2,4]");
    }

    @Test
    public void test_002_FindMaxAllNegative() {
        assertEquals(-1, Main.findMax(new int[]{-7, -5, -3, -1}), "trying to find the maximum in [-7,-5,-3,-1]");
        assertEquals(-3, Main.findMax(new int[]{-7, -5, -3, -99}), "trying to find the maximum in [-7,-5,-3,-99]");
    }

    @Test
    public void test_003_FindMaxNegativeAndPositive() {
        assertEquals(3, Main.findMax(new int[]{-7, -5, 3, -1}), "trying to find the maximum in [-7,-5,-3,-1]");
        assertEquals(5, Main.findMax(new int[]{-7, 5, -3, -99}), "trying to find the maximum in [-7,5,-3,-99]");
    }

    @Test
    public void test_004_FindMaxWithNull() {
        assertThrows(IllegalArgumentException.class, () -> {  Main.findMax(null); });
    }

}