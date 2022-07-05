package com.company;

import java.util.HashMap;

public class Main {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length ; i++) {
            hashMap.put(nums[i],0);
        }
        for (int j = 0; j <nums.length ; j++) {
            int v = hashMap.get(nums[j]);
            v++;
            hashMap.put(nums[j],v);
        }
        boolean containDuplicate = false;
        for (int value:  hashMap.values()) {
            if(value >= 2)
            {
                containDuplicate = true;
                break;
            }
            else{
                containDuplicate = false;
            }

        }
        return containDuplicate;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println("Result = "+result);

        /*
        Given an integer array nums, return true if any value appears
        at least twice in the array, and return false if every element is distinct.
        * Input: nums = [1,1,1,3,3,4,3,2,4,2]
          Output: true
        *
        * */

    }
}
