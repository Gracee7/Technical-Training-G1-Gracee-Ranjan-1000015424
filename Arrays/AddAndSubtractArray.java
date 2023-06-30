package Arrays;

public class AddAndSubtractArray {
    static void print(int[] array){
        System.out.println();
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int array1[] = {1,4,7,2,4,9};
        int array2[] = {3,5,2,1,3,4};
        int carry=0;

        System.out.println("Elements of Array1 are :- ");
        for (int i : array1) {
            System.out.print(i+" ");
        }
        System.out.println("\nElements of Array2 are :- ");
        for (int i : array2) {
            System.out.print(i+" ");
        }
    

        System.out.print("\nAddition of both Arrays is as follows(Array1 + Array2) :- ");
        //Array Addition
        for(int i=array1.length-1;i>=0;i--){
            if(carry==0){
                int sum = array1[i]+array2[i];
                if(sum>=10){
                    carry=1;
                }
                array2[i] = sum%10;
            }else{
                int sum = array1[i]+array2[i]+carry;
                carry=0;
                if(sum>=10){
                    carry=1;
                }
                array2[i] = sum%10;
            }
        }
        
        print(array2);        

        System.out.print("\nSubtraction of both Arrays is as follows(Array1 - Array2) :- ");
        //Array Substraction
        if(array1[0]>array2[0]){
            for(int i=array1.length-1;i>=0;i--){
                if(array1[i]<array2[i]){
                    if(carry>0){
                        array1[i] = array1[i]+10;
                        carry=-1;
                        int diff = array1[i]-array2[i];
                        array2[i]=diff;
                    }
                    else{
                        array1[i] = array1[i]+10-1;
                        carry=1;
                        int diff = array1[i]-array2[i];
                        array2[i]=diff;
                    }
                }
                else{
                    if(carry>0){
                        int diff = array1[i]-array2[i];
                        array2[i]=diff;
                    }
                    else{
                        array1[i] = array1[i]-1;
                        carry=1;
                        int diff = array1[i]-array2[i];
                        array2[i]=diff;
                    }
                }
            }
        print(array2);
        }
        else{
            for(int i=array1.length-1;i>=0;i--){
                if(array2[i]<array1[i]){
                    if(carry>0){
                        array2[i] = array2[i]+10;
                        carry=-1;
                        int diff = array2[i]-array1[i];
                        array1[i]=diff;
                    }
                    else{
                        array2[i] = array2[i]+10-1;
                        carry=1;
                        int diff = array2[i]-array1[i];
                        array1[i]=diff;
                    }
                }
                else{
                    if(carry>0){
                        int diff = array2[i]-array1[i];
                        array1[i]=diff;
                    }
                    else{
                        array2[i] = array2[i]-1;
                        carry=1;
                        int diff = array2[i]-array1[i];
                        array1[i]=diff;
                    }
                }
            }
        print(array1);
        }
        
    }
}
