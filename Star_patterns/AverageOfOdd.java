class AverageOfOdd{
    public static void main(String[] args){
        int num=1234567;
        int sum=0;
        int count=0;

        while(num!=0){
            int digit=num%10;

            if(digit%2 != 0){

                sum+=digit;
                count++;
            }

            num=num/10;
        }

        int avg=sum/count;

        System.out.println(avg);
    }
}