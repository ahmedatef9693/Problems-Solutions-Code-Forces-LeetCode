package com.company;

public class Main {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int x = 0;

        int []sols = new int[2];
        /*Arrays.sort(nums);*/

        while((i < j) &&(j<numbers.length)&&(i<numbers.length)){

            x = numbers[i]+numbers[j];

            if(x == target){
                sols[0] = i+1;
                sols[1] = j+1;
                break;
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
        int nums []={2,7,11,15};
        int sols[] = twoSum(nums,9);

/*        for (int i:sols) {
            System.out.println(i);
        }*/

    }
}
