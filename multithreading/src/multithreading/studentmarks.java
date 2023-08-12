package multithreading;
import java.util.Scanner;

public class studentmarks {
    public static void main(String[] args) {
        float [] marks = new float[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects: ");
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print("marks "+ (i+1)+" : ");
            marks[i] = in.nextFloat();
        }
        float total_marks = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]);
        float percentage = (total_marks/500)*100;

        System.out.print("Your Grade is: "); 
        if(percentage>=90){
            System.out.println("< A >");
        }else if(percentage<90 && percentage>=70){
            System.out.println("< B >");
        }else if(percentage<70 && percentage>=60){
            System.out.println("< C >");
        }else if(percentage<60 && percentage>=50){
            System.out.println("< D >");
        }else{
            System.out.println("< F >");
        }
    in.close();

    System.out.println("Total marks obtained out of 500: "+total_marks);
    System.out.println("Percentage: "+percentage+"% ");
   }
}
