class Power{
    public static void main(String[] args){
        int a_Power_b=power(2,3);

        System.out.println(a_Power_b);
    }

    public static int power(int a, int b){
        //we have to find a to the power b....here a is base and b is exponent

        int res=1;
        for(int i=b; i>0; i--){
            res=res*a;
        }

        return res;
    }
}