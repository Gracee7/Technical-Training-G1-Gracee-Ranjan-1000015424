//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1

//import java.util.*;
public class AllIndex {
          //Using Stack builder void
    public static void search(int[] array, int num, int index) {
        //Termination
        if(index==array.length){
            return;
        }
        //Business logic
        if(array[index]==num){
            System.out.println(index);
            return;
        }
        //recursive call
        search(array, num, index+1);
    }

    //Using Stack Falling void
    public static int Search(int[] array, int num, int index) {
        // Termination
        if (index < 0) {
            return -1;
        }
        
        // Business logic
        if (array[index] == num) {
            return index;
        }
        
        // Recursive call
        return Search(array, num, index - 1);
    }
    public static void main(String[] args) {
        int[] array = {50,20,10,30,20,60};
        search(array, 20, array.length);
        System.out.println(Search(array, 20, 0));
    }
    }

