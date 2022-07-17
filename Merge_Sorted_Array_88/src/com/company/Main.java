package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;
        int p2 = n-1;
        int zeroesIndex = (m + n)-1;
        int c=0;
        if( m == 0 && n ==1){
            nums1[0] = nums2[0];
        }
        else if(m == 1 && n == 0){
            return;
        }
        else if(m == 0 && n!=0){
            for (int i = 0; i <nums2.length ; i++) {
                nums1[i] = nums2[i];
            }
        }
        else if(m == 1 & n==1){
            if(nums1[0] < nums2[0]){
                nums1[1] = nums2[0];
            }else {
                nums1[1] = nums1[0];
                nums1[0] = nums2[0];
            }
        }

        else{

            while ( p1>=0 && p2>=0){
                if(nums2[p2] > nums1[p1]){
                    nums1[zeroesIndex] = nums2[p2];
                    System.out.println("Element = "+nums2[p2]);
                    nums2[p2] = Integer.MAX_VALUE;
                    p2--;


                }else {
                    nums1[zeroesIndex] = nums1[p1];
                    System.out.println("Element = "+nums1[p1]);
                    p1--;

                }

                zeroesIndex--;

            }


            System.out.println("p2 = "+p2);
            System.out.println("c = "+c);
            if(p2 != 0){
                int rest = p2+1;
                for (int i = 0; i <rest ; i++) {
                    nums1[i] = nums2[i];
                }
            }

            //Element at index p2 = 0
            for (int i = 0; i < nums2.length; i++) {
                if(nums2[i] != Integer.MAX_VALUE){
                    if(nums2[i]<nums1[i])
                        nums1[i] = nums2[i];
                }
            }




        }







        for (int i = 0; i <nums1.length ; i++) {
            System.out.println(nums1[i]);
        }



    }
    public static void main(String[] args) {
        int []nums1 = {0,0,3,0,0,0,0,0,0};
        int []nums2 = {-1,1,1,1,2,3};
        merge(nums1,3,nums2,6);


    }
}
