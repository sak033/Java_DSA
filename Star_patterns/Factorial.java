class Factorial{
    public static void main(String[] args){
        int num=123;

        while(num!=0){
            int fact=1;

            int digit=num%10;

            for(int i=digit; i>0; i--){
                fact=fact*i;
            }

            System.out.println(fact);
            num=num/10;
        }
    }
}