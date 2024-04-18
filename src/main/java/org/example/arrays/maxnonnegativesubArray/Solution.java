package org.example.arrays.maxnonnegativesubArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
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
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.set(i, Integer.parseInt(numbers[i+1]));
        }
        System.out.println("Max set: " + Solution.maxset(integers));
    }


}
