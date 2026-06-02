package day3;
public class CyberMaze {

    static void transactionRoute() {
        System.out.println("Transaction Route");
    }

    static void securityRoute() {
        System.out.println("Security Route");
    }

    public static void main(String[] args) {

        int option = 1;

        if(option == 1) {
            transactionRoute();
        }
        else if(option == 2) {
            securityRoute();
        }
    }
}