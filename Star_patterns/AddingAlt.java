class AddingAlt{
    public static void main(String[] args){
     //System.out.println(Rev(123));

     int num1=35134;
     int num2=35;
     int reverse=Rev(num1);
      int op=0;
     

     while(reverse!=0 && num2!=0){
      
       int last=reverse%10;
       op=op*10+last;
       int last2=num2%10;
       op=op*10+last2;
       reverse/=10;
       num2/=10;
     }
     while(num2!=0){
        int last=num2%10;
        op=op*10+last;
        num2/=10;
     }
     while(reverse!=0){
        int last=reverse%10;
        op=op*10+last;
        reverse/=10;
     }



    System.out.println(op); 
    

    }
    

    public static int Rev(int n){
        int rev=0;
        while(n!=0){
            int last=n%10;
            rev=rev*10+last;
            n/=10;
        }
        return rev;
    }
}