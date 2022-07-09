package com.company;
import java.net.StandardSocketOptions;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {

    public static int minMoves(int[] nums){
        int countMoves = 0;
        java.util.Arrays.sort(nums);
        int median = nums.length/2;
        System.out.println("Median  = "+median);
        for (int i = 0; i <nums.length ; i++) {

            if( i > median){
                countMoves += Math.abs(nums[median] - nums[i]);
            }else{
                countMoves += nums[median] - nums[i];
            }
        }
        return countMoves;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int minMoves = minMoves(nums);

        System.out.println("Min Number oF Moves = "+minMoves);

    }
}
