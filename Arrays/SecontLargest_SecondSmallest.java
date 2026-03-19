import java.util.*;

class SecontLargest_SecondSmallest{

    public static void main(String[] args){

    int[] arr = {100, 2, 50, 3, 1};
    
    int smallest=Integer.MAX_VALUE;
    int secondSmallest=Integer.MAX_VALUE;

    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]<smallest){
            
            secondSmallest=smallest;
             smallest=arr[i];
        }
        else if(arr[i]<secondSmallest && arr[i]!=smallest){
            secondSmallest=arr[i];
        }

        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondLargest && arr[i]!= largest){
            secondLargest=arr[i];
        }
    }

    System.out.println(smallest);

    System.out.println(secondSmallest);

    System.out.println(largest);

    System.out.println(secondLargest);
    
   
    }
    
}