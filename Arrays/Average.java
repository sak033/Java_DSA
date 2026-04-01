class Average{
    public static void main(String[] args){
        int[] arr={1,2,1,1,5,1};
        int count=0;
        int sum=0;

        for(int i=0; i<arr.length; i++){
            count+=1;
            sum+=arr[i];
        }

        float average=(float)sum/count;

        System.out.println(average);
    }
}