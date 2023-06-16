
class PowerOfThree {
       public static  boolean isPowerOfThree(int n) {
        if(n<1)  
        {               //Base Condition
            return false;
        }
        if(n==1)  
        {             //Base Condition
            return true;
        }
        if(n%3 != 0)            //Base Condition
        {
            return false;
        }
        return isPowerOfThree(n/3);     //Recurrence Relation
    }
    public static void main(String[] args)
    {
       System.out.println(isPowerOfThree(9));
    }
}  

