class CountOdd{
    public static void main(String[] args){
        int[] arr={1,2,4,5,6,43,65,32,8,9};

        int count=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}