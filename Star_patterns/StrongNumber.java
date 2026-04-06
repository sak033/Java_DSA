class StrongNumber{
    public static void main(String[] args){
        int num=145;
        int res=SumOfFact(num);

        if(num==res){
            System.out.print("Strong");
        }
        else{
            System.out.print("not Strong");
        }

    }

    public static int SumOfFact(int n){
        int sum=0;
        while(n!=0){
            int last=n%10;
            int fact=1;
            while(last>0){
                fact=fact*last;
                last--;
            }
            sum=sum+fact;
            n=n/10;
        }

        return sum;
    }
}