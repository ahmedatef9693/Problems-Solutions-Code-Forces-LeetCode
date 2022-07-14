package com.company;

public class Main {

    public static int Max_Subarray_Sum(int arr[] ,int start, int end){

        if(arr.length == 1){
            return arr[0];
        }
        int mid = arr.length/2;
        int starting_Index = 0;
        int endingIndex = arr.length-1;
        int left_sum = Integer.MIN_VALUE;
        int right_sum = Integer.MIN_VALUE;
        int sum = 0;
        int left_MSS = Max_Subarray_Sum(arr , starting_Index , mid);
        int right_MSS = Max_Subarray_Sum(arr ,mid+1 , endingIndex);

        //getting left sum
        for (int i = 0; i <mid-1 ; i++) {
            sum += arr[i];
            left_sum = Math.max(sum , left_sum);
        }
        sum = 0;
        //getting right sum
        for (int j = mid; j < arr.length ; j++) {
            sum += arr[j];
            right_sum = Math.max(sum , right_sum);
        }

        int answer = Math.max(left_MSS,right_MSS);
        return Math.max(answer,left_sum+right_sum);
    }

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
