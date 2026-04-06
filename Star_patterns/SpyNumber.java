class SpyNumber{
    public static void main(String[] args){
        int num=1124;
        int sumOfAll=Sum(num);
        int productOfAll=Product(num);

        if(sumOfAll==productOfAll){
            System.out.print("Spy number");
        }
        else{
            System.out.print("not Spy number");
        }
    }

    public static int Sum(int n){
        int sum=0;
        while(n!=0){
            int last=n%10;
            sum=sum+last;
            n/=10;
        }
        return sum;
    }

    public static int Product(int m){
        int res=1;
        while(m!=0){
            int last=m%10;
            res=res*last;
            m/=10;
        }
        return res;
    }
}