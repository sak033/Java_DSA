import java.util.*;

class BubbleSort{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int[] res=bubble(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] bubble(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped=false;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }

            if(swapped==false){
                break;
            }
        }

        return arr;
    }
}