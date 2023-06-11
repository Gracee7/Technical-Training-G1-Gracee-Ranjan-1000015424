//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


    //import java.util.*;
  
    public class AllOccurance {
     //Using Stack builder void
    public static void search(int[] array, int num, int index, int count) {
        //Termination
        if(index==array.length){
            System.out.println(count);
            return;
        }
        //Business logic
        if(array[index]==num){
            count++;
        }
        //recursive call
        search(array, num, (index+1), count);
    }

    //Using Stack Falling
    public static int search(int[]array, int num,int index) {
        //Termination
        if(index==array.length){
            return 0;
        }
        //recursive funtion call
        int count = search(array, num, index+1);
        //business logic
        if(array[index] == num){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int array[] = {50, 20, 30, 40, 20, 10, 60, 20};
        search(array, 20, 0, 0);
        System.out.println(search(array, 20, 0));   
    }
}

