class String1 {
    public static void main(String[] args) {
         String s="Hello";
        String a=s.toUpperCase(); 
        System.out.println(a);  
        
        System.out.println(s.length());
    
    System.out.println(s.toLowerCase());
    
    System.out.println(s.charAt(2));
    
    char[] c=s.toCharArray();
    System.out.println(c);
    
    String s2="Good Afternoon Everyone";
    String[] d=s2.split(" ");
    
    for(int i=0; i<d.length; i++){
        System.out.println(d[i]);
    }
    System.out.println("---------------");
    
    for(int i=d.length-1; i>=0; i--){
        System.out.println(d[i]);
    }
     System.out.println("---------------");
    for(int i=s.length()-1; i>=0; i--){
        System.out.print(s.charAt(i));
    }
    }
}