public class PowerOfFour {
       public static boolean isPowerOfFour(int n) {
        if(n<1)  //Base Condition
        {  
            return false;
        }
        if(n==1) //Base Condition 
        {  
            return true;
        }
        if(n%4 != 0)  //Base Condition
        {
            return false;
        }
        return isPowerOfFour(n/4);     //Recurrence Relation
    }

    public static void main(String args[])
    {
        System.out.println(isPowerOfFour(16));
    }
}