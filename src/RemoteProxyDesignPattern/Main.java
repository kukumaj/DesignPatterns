package RemoteProxyDesignPattern;

public class Main {

    public static void main(String[] args) {
	 Bank bank = new ProxyBank();

        try {
            bank.withdrawMoney("Paulo");
            bank.withdrawMoney("me@me");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//Paulo is withdrawing from the ATM....
//me@me Access Denied!  You are not who you say you are!