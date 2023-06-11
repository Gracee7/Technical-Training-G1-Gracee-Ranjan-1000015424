//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1

import java.util.ArrayList;

public class EmploySalery
{
    public static void FSalary(int[]EmpSalary, ArrayList<Integer> TaxSalary,double tax,int index)
    {
        //Termination case
        if(index==EmpSalary.length){
            System.out.println(TaxSalary);
            return;
        }
        //Business Logic
        TaxSalary.add((int)(EmpSalary[index] + (EmpSalary[index]*0.1)));
        //Recursive call
        FSalary(EmpSalary, TaxSalary, tax, index+1);

    }
    
    public static void main (String args[])
    {

        int[] EmpSalary = {89900,45670,78000,56700,23000,67000};
        ArrayList<Integer> TaxSalary = new ArrayList<>();
        FSalary(EmpSalary, TaxSalary, 0.1, 0);
        
    }
}
