class HappyNumber{
    public static void main(String[] args){
      int a=13;
      int original=a;
      int res=SumOfSqr(a);
      while(res!=4 && res!=1){
        res=SumOfSqr(res);
        
       }

       if(res==4){
        System.out.print("Sad number");

       }
       else if(res==1){
        System.out.print("Happy number");
       }

    }

   

     public static int SumOfSqr(int n){
        int sum=0;
        while(n!=0){
            int last=n%10;
            int sqr=last*last;
            sum+=sqr;
            n=n/10;
        }

        return sum;
    }
}