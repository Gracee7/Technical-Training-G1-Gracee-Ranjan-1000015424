package Arrays;

import java.util.*;

public class GasStationProblem {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int total=0;
        int tank=0;

        for(int i=0;i<gas.length;i++){
            tank = tank + gas[i] - cost[i];
            if(tank < 0){
                start = i+1;
                total = total + tank;
                tank =0;
            }
        }
        if(total + tank < 0){
            System.out.println("\"No Such point possible\"");
            return -1;
        } else {
            System.out.println("The Starting Point is  :- ");
            return start;
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array gas array size = cost array size : ");
        int size = sc.nextInt();
        int[] gas = new int[size];
        int[] cost = new int[size];
        System.out.println("Enter the elements of gas array : ");
        for(int i=0; i<size; i++){
            gas[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of cost array : ");
        for(int i=0; i<size; i++){
            cost[i] = sc.nextInt();
        }

        GasStationProblem GS = new GasStationProblem();
        System.out.println(GS.canCompleteCircuit(gas, cost));
        
        sc.close();
    }
    
}
