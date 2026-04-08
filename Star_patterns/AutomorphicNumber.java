class AutomorphicNumber{
    public static void main(String[] args){
        int num=25;
        int sqr=num*num;
        int rev=0;
        while(sqr>0){
            int last=sqr%10;
            rev=last+rev*10;
           
            sqr/=10;
        }
        int new1=0;
        while(rev>0){
             int last=rev%10;
              new1=last+new1*10;
             if(new1==num){
                System.out.print("yess");
             }
             rev/=10;
        }

        System.out.print("false");

    }
}