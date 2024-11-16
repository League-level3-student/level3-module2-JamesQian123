package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] words = {"James", "Food", "Nick", "Music", "Java"};
        assertEquals(4, _01_LinearSearch.linearSearch(words, "Java"));
        assertEquals(3, _01_LinearSearch.linearSearch(words, "Music"));
        assertEquals(0, _01_LinearSearch.linearSearch(words, "James"));
        
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] binaryArray = {1,2,5,6,25,36,74};
        assertEquals(3,_02_BinarySearch.binarySearch(binaryArray, 0, 6, 6));
        assertEquals(0,_02_BinarySearch.binarySearch(binaryArray, 0, 6, 1));
        assertEquals(6,_02_BinarySearch.binarySearch(binaryArray, 0, 6, 74));
    }
}
