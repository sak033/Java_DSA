class SumOfPrime{
    public static void main(String[] arga){
        int ll=3;
        int ul=15;   //3,5,7,11,13=additon==39
        int sum=0;
        for(int i=ll; i<=ul; i++){
            if(PrimeOrNot(i)){
                sum+=i;
            }
        }
        System.out.println(sum);

    }

    public static boolean PrimeOrNot(int n){
        if(n<=1){
            return false;
        }
        int count=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                count++;
                break;
            }

        }
        if(count!=0){
            return false;
        }
        return true;
    }
}