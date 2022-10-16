import java.util.HashMap;

//meet in the middle Four Arrays Problem
class HelloWorld {
    public static void main(String[] args) {
        
        int []arr1 = {2,1};
        int []arr2 = {2,1};
        int []arr3 = {3,4};
        int []arr4 = {3,1};
        int target = 10;
        HashMap <Integer, Integer> first_two = new HashMap <Integer, Integer>();
        HashMap <Integer, Integer> second_two = new HashMap <Integer, Integer>();
    
        for(int i = 0 ; i<arr1.length; i++){
            for(int j = 0 ; j<arr2.length; j++){
                int sum = arr1[i] + arr2[j];
                first_two.put(sum,0);
                
            }
           
        }
        for(int i = 0 ; i<arr3.length; i++){
            for(int j = 0 ; j<arr4.length; j++){
                int sum = arr3[i] + arr4[j];
                second_two.put(sum,0);
                
            }
           
        }
        

        for(int i = 0 ; i<arr1.length; i++){
            for(int j = 0 ; j<arr2.length; j++){
                int sum = arr1[i] + arr2[j];
                int val = first_two.get(sum);
                val++;
                first_two.put(sum,val);
            }
           
        }
        
        for(int i = 0 ; i<arr3.length; i++){
            for(int j = 0 ; j<arr4.length; j++){
                int sum = arr3[i] + arr4[j];
                int val = second_two.get(sum);
                val++;
                second_two.put(sum,val);
            }
           
        }
        
        
       int solutions = 0;   
        for (HashMap.Entry<Integer,Integer> entry2 : second_two.entrySet()) {
            
            int remainder = target - entry2.getKey();

            for (HashMap.Entry<Integer,Integer> entry1 : first_two.entrySet()){
                
        
                if(remainder == entry1.getKey()){
                    System.out.println("match in "+entry1.getKey());
                    solutions+=entry1.getValue();
                    System.out.println("Number of solutions = "+solutions);
        }
    }
  
}

          
          
          
         
       }
       

        
        
    }
