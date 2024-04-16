package org.example.arrays.maximumcontinoussum;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static int maxSubArray(final int[] A) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int j : A) {
            currSum += j;

            if (currSum > maxSum)
                maxSum = currSum;

            if (currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args){
        File inputFile = new File("input.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int n = Integer.parseInt(numbers[0]);
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(numbers[i+1]);
        }
        System.out.println("Maximum sum: " + Solution.maxSubArray(heights));
    }


}
