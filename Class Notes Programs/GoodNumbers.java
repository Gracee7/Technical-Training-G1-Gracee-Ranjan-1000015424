// in even index even number is present and at odd number prime numbers are present
// e.g. 3245

public class GoodNumbers {

    public int checkGoodnumber(long n){

        int mod = (int)Math.pow(10,9)+7;
        long even = 0;
        long prime = 0;
        if(n%2==0){
            even = n/2;
            prime = n/2;
        }
        else{
            even = (n+1)/2;
            prime = n-even;
        }

        long even_places = pow(5,even);
        long odd_places = pow(4,prime);
        long ans=(even_places * odd_places) % mod;
        return (int)ans;
    }

    //calculate power
    public long pow(int x,long n){
        int mod = (int)Math.pow(10,90)+7;

        if(n==0){
            return 1;
        }

        long ans = pow(x,n/2);
        ans=ans*ans%mod;

        if(n%2==0){
            return ans;
        }
        return x*ans%mod;
    }

    public static void main(String rags[]){
        
    }
    
}
