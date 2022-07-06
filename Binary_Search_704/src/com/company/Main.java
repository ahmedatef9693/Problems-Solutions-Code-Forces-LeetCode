package com.company;

public class Main {
    public static int search(int[] nums, int target) {
        int mid = nums.length/2;
        int neededIndex = -1;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            int last = nums.length;
            for(int first = 0 ; first < last ; first++){
                if(nums[first] == target){
                    neededIndex = first;
                }
            }
        }
        else if( nums[mid] > target){
            int last = mid;
            for(int first = 0; first < last ; first++){

                if(nums[first] == target){
                    neededIndex = first;
                }
            }
        }
        return neededIndex;

    }
    public static void main(String[] args) {
        int nums[] ={2,5};
        int target = 2;
        int index = search(nums,target);
        System.out.println(index);


    }
}
