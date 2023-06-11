//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


class pattern1{
    public static int pattern(int n)
    {
        if(n==0)
            return 0;
        else
        {   
            System.out.print("*"+n+"\t");   
            return pattern(n-1);
        }
    }
    public static void  main(String args[])
    {
        int n=5;
        pattern(n);
    }
}
