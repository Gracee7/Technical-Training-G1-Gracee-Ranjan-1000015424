import java.util.*;
//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


class power
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter base");
    		int base=sc.nextInt();
    		System.out.println("Enter exponent");
    		int exponent=sc.nextInt();
			int result=0;
    		System.out.println("Power Result :- " + powercal(base,exponent)); 
		    powercal1( base, exponent, result); // Return using stack Fall
			powercal1(5, 2,1); // Return Using Stack Builder
            sc.close();
    	} 

	
	//USing Stack falling
	static int powercal(int b,int e)
	{
		// termination case
		if(e==0)
        		return 1;
    		else
        		return (b*powercal(b,e-1));	// recursive call
	}


	//USing Stack builder
	
	public static void powercal1(int num,int pow, int result) {
        //Termination case
        if(pow==0){
              return;
        }
        //Business logic
        result = result*num;
        //recursive call 
        powercal1(num, pow-1,result);    
    }

    }

