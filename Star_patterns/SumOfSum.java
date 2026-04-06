class SumOfSum{
    public static void main(String[] args){

      int n=7777777;
      int res=Sum(n);
     // System.out.println(SumOfNum(res));
     while(res>9){
         res=Sum(res);

     }

     System.out.println(res);



    }
   
    

    public static int Sum(int n){
        int sum=0;
        while(n!=0){
            int last=n%10;
            sum+=last;
            n=n/10;
        }

        return sum;
    }
}