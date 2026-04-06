class NeonNumber{
    public static void main(String[] args){
        int num=9;
        int sqr=num*num;
        int res=SumOfDigitsOfSqr(sqr);
        if(num==res){
            System.out.print("Neon number");

        }
        else{
            System.out.print("Not neon number");
        }
    }

    public static int SumOfDigitsOfSqr(int n){
        int sum=0;
        while(n!=0){
            int last=n%10;
            sum=sum+last;
            n/=10;
        }
        return sum;
    }

}