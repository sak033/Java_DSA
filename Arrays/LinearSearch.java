import java.util.*;
class LinearSearch{
    public static void main(String[] args){
      int[] array={1, 12, 23, 45, 2,5};
      int tar=45;
      int res=search(array,tar);
      System.out.println(res);

      //O(1)
      
    }

    public static int search(int[] arr, int target){
         /*for(int i=0; i< arr.length; i++){
            if(arr[i]==target){
                return i;
            }
           
         }

         return -1;
           */

     //O(1)
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0; i<arr.length; i++){
        map.put(arr[i], i);
     }
     if(map.containsKey(target)){
        return map.get(target);
     }

     return -1;

    }

  



}