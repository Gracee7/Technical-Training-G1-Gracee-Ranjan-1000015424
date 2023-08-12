package multithreading;

import java.util.Scanner;

public class hostelfood {
    public static void main(String[] args) {
       String[] order = new String[9];
       int choice;
       int i=0;
       Scanner in = new Scanner(System.in);

       while(true){

        System.out.println("\n************Welcome to Hotel*************");
        System.out.println("\n\n--------Food Menu--------");
        System.out.println("1. Aalo paratha");
        System.out.println("2. Custard");       
        System.out.println("3. Momos");
        System.out.println("4. Salad");
        System.out.println("5. Paneer Bhurje");
        System.out.println("6. Chicken Curry");
        System.out.println("7. Masala Dosa");
        System.out.println("8. Roti");
        System.out.println("9. Exit");
        
        
        System.out.println("\nPlease choose from the following: ");
        choice = in.nextInt();
        in.nextLine();

        switch(choice){
            case 1: order[i]="Aalo paratha";
                    ++i;  
                    break;
            case 2: order[i]="Custard";
                    ++i;  
                    break;
            case 3: order[i]="Momos";
                    ++i;  
                    break;
            case 4: order[i]="Salad";
                    ++i;  
                    break;
            case 5: order[i]="Paneer Bhurje";
                    ++i;  
                    break;
            case 6: order[i]="Chicken Curry";
                    ++i;  
                    break;
            case 7: order[i]="Masala Dosa";
                    ++i;  
                    break;
            case 8: order[i]="Roti";
                    ++i;  
                    break;
            default: break;
        }
        if(choice==9){
            System.out.println(" Bon Appetit !! Thank You !!");
            break;
        } 
        System.out.println("\n*.*.*.*.*.*.The ordered list is:.*.*.*.*.*.* ");
        for(int j=0;j<i;j++){
            System.out.println("   "+(j+1)+". "+order[j]);
        }
        
        System.out.print("Want to enter more?(Y/N): ");
        String ch = in.nextLine();
        
        if(ch.equalsIgnoreCase("N")){
            System.out.println("\n*.*.*.*.*.*.*.Your order is:.*.*.*.*.*.*.*");
            for(int j=0;j<i;j++){
                System.out.println("   "+(j+1)+". "+order[j]);
            }
            System.out.println("\nBon Appetit !! Thank You !! :)");
            break;
        }
       }
       in.close();
    }
}

