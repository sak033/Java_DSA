import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args){
        int[]  arr={1,1,2,4,5,3,2,1,1,4,5,6,2,3,5,6};
        Arrays.sort(arr);
        int p1=0;
        
        for(int p2=1; p2<arr.length; p2++){
            if(arr[p1]!=arr[p2]){
                p1++;
                arr[p1]=arr[p2];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}