package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static class Pair{
        int key;
        int value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public static void showPairs(List<Pair> pairList){
        for (int k = 0; k <pairList.size() ; k++) {

            System.out.print(pairList.get(k).key + " : ");
            System.out.println(pairList.get(k).value);
        }

    }
    public static int getIndexFromUnSorted(int number,List<Pair> pairList){
        int index = 0;
        for (int i = 0; i < pairList.size(); i++) {

            if(pairList.get(i).key == number){
                index = pairList.get(i).value;
                pairList.remove(i);
                return index;
            }else{
                index = -1;
            }
        }
        return index;
    }
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int x = 0;
        int []sols = new int[2];
        List<Pair> pairList = new ArrayList<Pair>();
        for (int index = 0 ; index < nums.length; index++){
            Pair pair = new Pair(nums[index],index);
            pairList.add(pair);
        }
        Arrays.sort(nums);
        while((i < j) &&(j<nums.length)&&(i<nums.length)){
            x = nums[i]+nums[j];

            if(x == target){

                sols[0] = getIndexFromUnSorted(nums[i],pairList);
                sols[1] = getIndexFromUnSorted(nums[j],pairList);
                return sols;

            }
            else if(x > target){
                j--;
            }

            else if(x < target){
                i++;
            }
        }

        return sols;
    }

    public static void main(String[] args) {
	    int arr[] = {3,2,4};
        int sols[] = twoSum(arr , 6);

        System.out.println(sols[0]);
        System.out.println(sols[1]);

    }
}
