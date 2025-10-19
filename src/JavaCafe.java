import java.util.Scanner;

public class JavaCafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billamount=0;
        System.out.println("---- Welcome to Java Cafe----");
        System.out.print("Enter the Number of items you need: ");
        int items = sc.nextInt();
        for (int i = 1; i <=items ; i++) {
            System.out.print("Enter the  Price for "+i+": ");
            int value=sc.nextInt();
            billamount+=value;
        }
        double GST= 0.18 *billamount;
        System.out.println("-----------------------");
        System.out.println("Bill amount: "+billamount);
        System.out.println("GST Amount: "+GST);
        System.out.println("-----------------------");
        System.out.println("Sub Total: "+(billamount+GST));
    }

}
