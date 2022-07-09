package com.company;

import java.lang.reflect.Array;

public class Main {

    public static int getMinNumber(int[]nums){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <nums.length ; i++) {

            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
    public static int minMoves(int[] nums) {
        int countMoves = 0;
        int min = getMinNumber(nums);
        for (int i = 0; i < nums.length ; i++) {

            countMoves += nums[i]-min;

        }
        return countMoves;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int munMoves = minMoves(arr);

        System.out.println(munMoves);

    }
}
