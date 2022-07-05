package com.company;
import java.security.KeyPair;
import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static class Pair
    {
        int key;
        int value;
        public Pair(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }
    public static int[] enteringArrayElements(){
        int size =0;
        System.out.print("Enter Array Size = ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i= 0 ; i <size;i++){
            arr[i] = scanner.nextInt();
        }

        //Entering Elements to the array
        System.out.println("Here Is Array Elements");
        for(int i= 0 ; i <size;i++){
            System.out.println(arr[i]);
        }
        System.out.println("------------------------------------------------");
        return arr;
    }
    public static void showMeArrayElements(Integer arr[]){
        for(int i= 0 ; i <20;i++){
            System.out.println(arr[i]);
        }
    }
    public static HashMap getRepeatedCount(Integer arr[]){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int counter = 0;
        for (int i = 0 ;i<arr.length;i++){
            map.put(arr[i],0);
        }
        for (int j = 0 ; j <arr.length;j++){
            int value = map.get(arr[j]);
            value++;
            map.put(arr[j],value++);
        }
        return map;
    }
    public static boolean sortedOrNot(List<Integer>oldList , List<Integer> newList){
        int sortedElementsCounter = 0;
        boolean sorted = false;
        for(int index= 0 ;index<oldList.size();index++){
            int check = oldList.get(index) - newList.get(index);
            if(check == 0){
                sortedElementsCounter++;
            }
        }
        if (sortedElementsCounter == oldList.size()){
            sorted = true;
        }
        return sorted;
    }
    public static List<Pair> Comparator(Integer[]oldArrList , Integer []newArrList , HashMap<Integer,Integer> map){
        /**/HashMap<Integer,Integer> newMap = new HashMap<Integer, Integer>();
        List<Pair> PairList = new ArrayList<Pair>();
        int size = map.size();

        if (size == 1){
            Pair pair = new Pair(map.keySet().iterator().next(),map.values().iterator().next());
            PairList.add(pair);
        }
        // if the list already sorted that means oldList = newList
        else {
/*            map.forEach((key,value)->{
                Pair pair = new Pair(key,value);
                PairList.add(pair);
            });*/

            for(int newIndex = 0 ; newIndex < newArrList.length ; newIndex++){
                for(int oldIndex = 0 ; oldIndex< oldArrList.length;oldIndex++){
                    if (oldArrList[oldIndex] > 0 && newArrList[newIndex] >0){
                        if(oldArrList[oldIndex] == newArrList[newIndex]){
                            Pair pair = new Pair(oldIndex,oldArrList[oldIndex]);
                            PairList.add(pair);

                            oldArrList[oldIndex] = -1;
                            newArrList[newIndex] = -1;
                        }

                    }
                }
            }
        }

        return PairList;
    }
    public static void showPairs(List<Pair> pairList){

        for(int i =0 ;i<pairList.size();i++){
            System.out.print(pairList.get(i).key+ " : ");
            System.out.println(pairList.get(i).value);
        }
    }
    public static List<Pair> maxValue(HashMap<Integer,Integer> map){
        Integer[] oldArrList = new Integer[100];
        java.util.Arrays.fill(oldArrList,0);
        Integer []newArrList = new Integer[100];
        /*HashMap<Integer,Integer> newMap = new HashMap<Integer, Integer>();*/
        List<Pair> pairList = new ArrayList<Pair>();
        map.forEach((key,value)->{
            oldArrList[key] = value;
        });

        for (int ind = 0 ; ind<newArrList.length;ind++){
            newArrList[ind] = oldArrList[ind];
        }
        //Desc Order
        Arrays.sort(newArrList,Collections.reverseOrder());
        pairList = Comparator(oldArrList,newArrList,map);
        showPairs(pairList);
        return pairList;
    }
    static int countNumberOfElements(List<Pair> orderedList){
        int NumberofElements = 0;
        for(int i = 0 ; i<orderedList.size();i++){
            NumberofElements += orderedList.get(i).value;
        }

        return NumberofElements;
    }

    static String Algorithm(List<Pair> orderedList){
        String answer = "";
        int size = orderedList.size();
        //only one group
        if(size == 1){
            if(orderedList.get(0).value == 1){
                answer = "YES";
            }else{
                answer = "NO";
            }
        }else {
            // Most Repeated Count
            int repeatedCounter = orderedList.get(0).value;
            int numberofElements = countNumberOfElements(orderedList);
            int division = 0;
            // if N Is odd
            if(numberofElements % 2 == 0){
                division = numberofElements/2;
                if(division >= repeatedCounter)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }else{
                division = numberofElements/2;
                division += 1;
                if(division >= repeatedCounter)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                division = 0;

            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Integer arr[] ={1,1,3,1,1};
        HashMap<Integer, Integer> map = getRepeatedCount(arr);
        List<Pair> pairListSorted = new ArrayList<Pair>();
        System.out.println(map);
        pairListSorted = maxValue(map);
        Algorithm(pairListSorted);
    }
}
