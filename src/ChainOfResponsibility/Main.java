package ChainOfResponsibility;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        CEOPurchasePower ceoPurchasePower = new CEOPurchasePower();
        DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
        ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();
        ceoPurchasePower.setSuccessor(directorPurchasePower);
        directorPurchasePower.setSuccessor(ceoPurchasePower);
        managerPurchasePower.setSuccessor(directorPurchasePower);
        while (true) {
            System.out.println("Enter the amount to check who should approve your budget:");
            System.out.print(">>");
            try {
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                managerPurchasePower.processRequest(new PurchaseRequest(d, "By Stuff"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
//Enter the amount to check who should approve your budget:
//>>1000
//Manager will aprove $1000.0
//Enter the amount to check who should approve your budget:
//>>5000
//Manager will aprove $5000.0
//Enter the amount to check who should approve your budget:
//>>10000
//Director will aprove $10000.0
//Enter the amount to check who should approve your budget:
//>>5000
//Manager will aprove $5000.0
//Enter the amount to check who should approve your budget:
//>>10000
//Director will aprove $10000.0
//Enter the amount to check who should approve your budget:
//>>200000
//CEO will aprove $200000.0
//Enter the amount to check who should approve your budget:
//>>