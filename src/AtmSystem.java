import java.util.Scanner;

public class AtmSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Welcome to SBI ------ \n What sevice do you choose" );
        System.out.println("1. Check Balance \n 2. Cash Deposite \n 3. Cash Withdrawal \n 4. Exit");
        int balance =10000;
        System.out.print("Enter your Choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Your Current  Balance is : "+balance);
                break;
            case 2:
                System.out.print("Enter the Amount you need to Deposite: ");
                int deposite=sc.nextInt();
                balance+=deposite;
                System.out.println(deposite+" has been deposited Successfully \nYour Current balancec is: "+balance);
                break;
            case 3:
                System.out.println("Enter the Amount you need to withdraw :");
                int Withdraw=sc.nextInt();
                if(Withdraw>balance){
                    System.out.println("Insufficient Balance");
                }
                else{
                    balance-=Withdraw;
                    System.out.println(Withdraw+" has been Withdrawn the Remaining Balance is :"+balance);
                }
                break;
            case 4:
                System.out.println("-------- Thank You For Visiting SBI . Visit Again ---------");
                break;
            default:
                System.out.println("Enter a Valid Choice");
        }

    }
}
