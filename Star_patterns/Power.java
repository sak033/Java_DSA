class Power{
    public static void main(String[] args){
        //int a_Power_b=power(5,2);


        int number=153;
        int original=number;
         int e= count(number);
        int sum=0;
        while(number!=0){
            int last_digit=number%10;
           
            sum+= power(last_digit, e);
            number/=10;
        }

        if(original==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not Armstrong number");
        }

        //return original==sum;
    }
  


    public static int count(int num){
        int count=0;
        while(num!=0){
          
          count++;
          num/=10;

          
        }
        return count;
    }

    public static int power(int a, int b){
        //we have to find a to the power b....here a is base and b is exponent

        int res=1;
        for(int i=1; i<=b; i++){
            res=res*a;
        }

        return res;
    }
}