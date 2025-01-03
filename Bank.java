
import java.util.Scanner;
public class Bank {
    //deposit
    //withdrawal
    //check balance
    // any loan offers
    // exit
    public static void main(String[] args) {
        Double cb = 45678946.78;
        Double ga ;
        Scanner sc = new Scanner(System.in);
        char choice;
        int acc=1234;
        int passkey=9999;
        do{
            
            System.out.println("Welcome to JAS Bank");
            System.out.println();
            System.out.println("Enter account Number");
            int a=sc.nextInt();
            System.out.println("Enter password");
            int p=sc.nextInt();
            if(p==passkey && a==acc){
                  
            
             System.out.println("Please choose from below option");
             System.out.println("Deposit : 1");
             System.out.println("Withdrawal : 2");
             System.out.println("Check balance : 3");
             System.out.println("Loan service : 4");
             System.out.println("Exit : 5");
             int o = sc.nextInt();
             switch (o) {
                 case 1:
                    System.out.println("Enter the amount to be Deposited");
                    ga =sc.nextDouble();
                    cb = cb+ga;
                    System.out.println("Current balance"+cb);
                    break;
                 case 2:
                    System.out.println("Enter the amount to be withdraw");
                    ga =sc.nextDouble();
                    cb =cb-ga;
                    System.out.println("Current balance"+cb);
                    break;
                 case 3:
                    System.out.println("Current balance"+cb);
                    break;
                 case 4:
                    System.out.println("Thanks for choosing our bank");
                    System.out.println("You will soon contacted with our Bank employee");
                    break;
                 case 5:
                    System.out.println("Thanks for visiting Jas Bank");  
                    break;  
                 default:
                    break;
                }
              
            }
            else{
                System.out.println("Invalid passkey or account no");
                System.out.println("Please visit our nearest bank to open a account");
            } 
            System.out.println("Do you want to continue (y/n)");
            choice=sc.next().charAt(0);
        
        }while(choice=='y');
    
        sc.close();
     


     
    }
}
