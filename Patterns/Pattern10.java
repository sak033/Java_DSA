class Pattern10{
    public static void main(String[] args){
        int n=3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n*2-1; j++){
                if(i+j>=n+1){
                    System.out.print(j);
                }
                else if(j-i<=n){
                    System.out.print(n*2-j);
                }
            }
            System.out.println();
        }
    }
}