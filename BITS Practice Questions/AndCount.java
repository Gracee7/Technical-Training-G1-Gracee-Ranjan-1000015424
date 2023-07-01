public class AndCount {

    public static void count(int n){

        int result;
        int counter = 0;
        
        
        for(int x=0;x<=n;x++){
            result = n & x;
            if(result == x){
                counter = counter +1;
                System.out.print("\t"+x);
            }
        }
        System.out.println("\n The number of integers x that satisfy the condition for n = "+n+" are :- ");
        System.out.println("\t"+counter);

    }
    public static void main(String[] args){
       int n =5; 
       System.out.println("The integers x that satisfy the condition are :- "); 
       count(n);
    }
}
