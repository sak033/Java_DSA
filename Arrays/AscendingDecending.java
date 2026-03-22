import java.util.*;

 class AscendingDecending{
    public static void main(String[] args){
        //int[] arr={7,3,1,8,4,5};
        int[] arr={4,2,8,6,15,5,9,20};

        TreeMap<Integer, Integer> map=new TreeMap<>();

        for(int i=0; i<arr.length; i++){
           if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);
           }
           else{
            map.put(arr[i], 1);
           }
        }
        ArrayList<Integer> arr2=new ArrayList<>(map.keySet());
        System.out.println(arr2);

        int mid=arr2.size()/2;
        int start=mid;
        int end=arr2.size()-1;
       for(int i=mid; i<arr2.size(); i++){
           if(start<end){
            if(start!=end){
            int temp=arr2.get(start);
            arr2.set(start, arr2.get(end));
            arr2.set(end, temp);
            start++;
            end--;
            }
           }
       }

       System.out.println(arr2);


    }
 }