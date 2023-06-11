//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1

public class FindReplace {
    //Using Stack Builing void
    public static void S_R(int[] array, int search, int replace, int index) {
        //Termination
        if(index == array.length){
            return;
        }
        //Business logic
        if(array[index] == search){
            array[index] = replace;
        }
        System.out.println(array[index]);
        //recursive call
        S_R(array, search, replace, index+1);
    }

    //using Stack Falling method
    public static int[] S_R(int[] array, int search, int replace) {
        //Termination case
        if (array.length == 1) {
            if (array[0] == search) {
                int[]ar = {replace};
                return ar;
            } else {
                return array;
            }
        }
        
        int[] arr = new int[array.length - 1];
        System.arraycopy(array, 1, arr, 0, array.length - 1);
        //Recursive call
        int[] modarr = S_R(arr, search, replace);
    
        //Business Logic
        if (array[0] == search) {
            int[] result = new int[modarr.length + 1];
            result[0] = replace;
            System.arraycopy(modarr, 0, result, 1, modarr.length);
            return result;
        } else {
            int[] result = new int[modarr.length + 1];
            result[0] = array[0];
            System.arraycopy(modarr, 0, result, 1, modarr.length);
            return result;
        }
    }
    public static void main(String[] args) {
        int[] array = {50,20,10,30,10,40,10};
        S_R(array, 10, 100, 0);
        System.out.println();
        int[] newarray = S_R(array, 20, 100);
        for(int t : newarray){
            System.out.println(t);
        }
    }
}
