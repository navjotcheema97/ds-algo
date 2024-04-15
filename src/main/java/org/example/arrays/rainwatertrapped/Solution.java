package org.example.arrays.rainwatertrapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static int trap(final int[] A) {
        int water = 0, max = Integer.MIN_VALUE, maxIndex=0;
        for(int i=0; i<A.length; i++) {
            if(A[i] > max) {
                max = A[i];
                maxIndex = i;
            }
        }

        int leftMax = Integer.MIN_VALUE;
        for(int i=0; i<maxIndex; i++) {
            if(leftMax < A[i])
                leftMax = A[i];

            water += leftMax-A[i];
        }

        int rightMax = Integer.MIN_VALUE;
        for(int i=A.length-1; i>maxIndex; i--) {
            if(rightMax < A[i])
                rightMax = A[i];

            water += rightMax-A[i];
        }
        return water;
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
        System.out.println("Trapped water: " + Solution.trap(heights));
    }


}
