import java.util.*;

class RotateArrayBy_K_Element{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
    
        int k=2;
        
        int[] part1=new int[k];
        int[] part2=new int[arr.length-k];

        for(int i=0; i<k; i++){
            part1[i]=arr[i];
        }

        for(int i=k; i<arr.length; i++){
            part2[i-k]=arr[i];
        }

        System.out.println(Arrays.toString(part1));
        System.out.println(Arrays.toString(part2));

       int[] res=new int[arr.length];

       for(int i=0; i< part2.length; i++){
        res[i]=part2[i];
       }
       for(int i=0; i<part1.length; i++){
        res[part2.length+i]=part1[i];
       }

       System.out.println(Arrays.toString(res));

    }
}