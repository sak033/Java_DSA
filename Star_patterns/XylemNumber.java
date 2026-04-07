class XylemNumber{
    public static void main(String[] args){
        int num=12326;
        int sum1=num%10;
        num/=10;
        int sum2=0;
        while(num>9){
            sum2+=num%10;
            num/=10;
        }

        sum1+=num;
        if(sum1==sum2){
            System.out.println("Xylem number");
        }
        else{
            System.out.println("Pholem number");
        }
    }
}