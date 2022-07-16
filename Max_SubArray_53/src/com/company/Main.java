package com.company;

public class Main {

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int val = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > val){
                val = sum;
            }
            if(sum < 0 ){
                sum = 0;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        int nums [] = {5,4,-1,7,8};
        int result = maxSubArray(nums);
        System.out.println("Result = "+result);
    }
}
