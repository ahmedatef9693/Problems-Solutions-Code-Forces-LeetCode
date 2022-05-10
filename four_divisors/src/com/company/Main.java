package com.company;
//Four divisors Problem
//Difficulty Level Hard

public class Main {

    public static void showArrayValues(int []arr){
        int count;
        for (int i = 0 ; i <arr.length;i++){
            int currentElement = arr[i];
            int Temp = arr[i];
            int j = 0;
            count = 0;
            int summer=0;
            while(Temp >= 1){
                if(currentElement %Temp ==0){
                    count++;
                    summer+=Temp;
                }
                Temp--;
                if (count==4){
                    System.out.println("At Number = "+currentElement);
                    System.out.println("Output = "+summer);
                }
            }


        }


    }
    public static void main(String[] args) {
	int arr[] = {21,4,7};
    showArrayValues(arr);



    }
}
