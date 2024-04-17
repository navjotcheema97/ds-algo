package org.example.arrays.addonetonumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int carry = 1;
        int num;
        int size = A.size();

        // traversing the digits of the number in reverse order
        for (int i = size - 1; i >= 0; i--) {

            num = A.get(i);
            num += carry;
            carry = 0;

            if (num == 10) {
                num = 0;
                carry = 1;
            }

            A.set(i, num);

        }

        ArrayList<Integer> res = new ArrayList<Integer>();

        if (carry == 1)
            res.add(1);

        for (int x : A) {
            if (x == 0 && res.size() == 0)
                continue;
            res.add(x);
        }

        return res;

    }

    public static void main(String[] args) {
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
        System.out.println("Add to number: " + Solution.plusOne(integers));
    }
}
