import java.util.*;
class ReverseArray{
    public static void main(String[] args){
        //int[] arr={10,20,30,40};
        int[] arr={5,4,3,2,1};
       
       /*Time complexity-->O(n) Space complexity---> O(n)
        int[] arr2= new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arr2[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arr2));
        */

       //optimal solution use 2 pointers 1.start 2. end

       int start=0;
       int end=arr.length-1;

       for(int i=0; i<arr.length-1; i++){
           if(start<end){
            if(start!=end){
            int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
           }
           }
       }

       

       System.out.println(Arrays.toString(arr));
    }
}