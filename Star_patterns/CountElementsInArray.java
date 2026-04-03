import java.util.*;

class CountElementsInArray{
    public static void main(String[] args){
     int[] arr={9,60,30,180,7505};
     System.out.println(Arrays.toString(arr));
     int[] op=countElements(arr);
     System.out.println(Arrays.toString(op));
    }

   public static int[] countElements(int[] arr){
    int[] res=new int[arr.length];

    for(int i=0; i<arr.length; i++){
        res[i]=count(arr[i]);
    }

    return res;
   }

    public static int count(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }

}