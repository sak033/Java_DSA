class Smallest_Element{
    public static void main(String[] args){
        int[] arr={2,5,1,3,0};
        int[] arr1={8,10,5,7,9};
        int min=arr[0];
       // int p1=arr[0];
       // int p2=arr[1];

        /*for(int i=0; i<=arr1.length-1; i++){
            for(int j=i+1; j<=arr1.length-1; j++){
                if(arr1[i]<arr1[j]){
                    min=arr1[i];
                }
                else if(arr1[i]>arr1[j]){
                    min=arr1[j];
                }
                
            }
        }*/

  for(int i=1; i<arr.length; i++){
    if(arr[i]<min){
        min=arr[i];
    }
    
  }

 
        
        System.out.println(min);
    }
}