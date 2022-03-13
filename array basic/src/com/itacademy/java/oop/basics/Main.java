package com.itacademy.java.oop.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{40, 55, 63, 17, 22, 68, 89, 97, 89};
        System.out.println(Arrays.toString(numbers));
        List<Integer> list = new ArrayList<Integer>();
        for (int number : numbers) {
            list.add(number);
        }
        for(int number: list){
            System.out.print(number + " ");
        }

    }
}
