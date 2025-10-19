import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Calculator Program");
        System.out.print("Enter first Number: ");
        int num1=input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=input.nextInt();
        System.out.println("Enter Your Choice of operator");
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modules \n6. Exit");
        System.out.print("Enter Your Choice: ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("The Addition is :"+(num1+num2));
                break;
            case 2:
                System.out.println("The Subraction is :"+ (num1-num2));
                break;
            case 3:
                System.out.println("The Multiplication is :"+(num1*num2));
                break;
            case 4:
                System.out.println("The Division is :"+(num1/num2));
                break;
            case 5:
                System.out.println("The Modules is :"+(num1%num2));
                break;
            case 6:
                System.out.println("Thank you Visit again");
                break;
            default:
                System.out.println("Enter a Valid Input");


        }
    }
}
