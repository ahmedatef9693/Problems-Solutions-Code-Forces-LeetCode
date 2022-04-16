package com.company;
import java.lang.Math;
import java.util.HashMap;
import java.util.regex.Pattern;


public class Main {


    public static void naivePatternMatch(){
        String str = "abcdabcabcdf";
        String pat = "abcdf";
        int foundIndex = 0;
        char []pattern = pat.toCharArray();
        char[]myStr = str.toCharArray();
        int []Visited = new int[pattern.length];
        for (int i = 0;i<pattern.length;i++) {

            if((pattern[i] == myStr[i]) && (foundIndex==pattern.length)) {
                Visited[i] = i;
                foundIndex++;

            }else {
                for (int j = i+1 ;j<myStr.length;j++){
                    if(pattern[i] == myStr[j]){
                        Visited[i] = j;
                    }

                }
            }


        }
        System.out.println("--------------------------------------------");
        int k = 0;
        for(int i = 0; i <Visited.length;i++){
            k = i+1;
            if(k < Visited.length){
                int diff = Math.abs(Visited[i] - Visited[k]);
                if(diff == 1){
                    System.out.println(Visited[i]);
                }else{
                    System.out.println("No Matching String");
                    return;
                }

            }else {
                int diff = Math.abs(Visited[i] - Visited[i-1]);
                if (diff == 1){
                    System.out.println(Visited[i]);
                }else {
                    System.out.println("No Matching String");
                    return;
                }
            }

        }
        }

    public static void KMP_Algorithm(){

        String Haystack = "AAAXAAAC";
        String patt = "AC";
        char []haystack = Haystack.toCharArray();
        char []pat = patt.toCharArray();
        int []Lps = new int[pat.length];


        if (Haystack.length() == 0 ){
            return;
        }
        //Filling them with zeroes
        for (int i = 0; i <pat.length;i++){
            Lps[i] = 0;
        }
        //Forming Longest Prefix Suffix Array For Kmp Algorithm
        int prevLps = 0;
        int i = 1;
        while(i < pat.length){
            if(pat[i] == pat[prevLps]){
                Lps[i] = prevLps + 1;
                // because we dont have to go back and check every char with the beginning char
                prevLps++;
                i++;
            }
            else if(prevLps == 0){
                Lps[i] = 0;
                i++;
                }
            else{
                prevLps = Lps[prevLps - 1];
                }
            }
        //Displaying LPS Array
        /*
        for( int k = 0;k <Lps.length;k++){
            System.out.println(Lps[k]);
        }
       */
        //Applying Kmp Algorithm
        i = 0;
        int j = 0;
        int IndexFound = 0;
        while ( i < haystack.length && j < pat.length ){
            if(haystack[i] == pat[j]){
                i++;
                j++;
                //System.out.println("i value = "+i);
                //System.out.println("j value = "+j);
            }else {
                if (j == 0){
                    i++;
                }
                else{
                    j = Lps[j-1];
                }

            }
            if (j == pat.length){
                IndexFound = i - pat.length;
            }
        }
        System.out.println("Found Index At = "+IndexFound);



    }





    public static void main(String[] args) {
        KMP_Algorithm();









    }
}
