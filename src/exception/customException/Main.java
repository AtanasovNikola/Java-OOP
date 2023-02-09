package exception.customException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String username = scanner.nextLine();
            String password = scanner.nextLine();

            Client client = null;
            try {
                client = new Client(username,password);
            }catch (MyException e){
                System.out.println(e.getMessage());
                continue;
            }

            String welcomeName = client.getUsername().substring(0,1).toUpperCase() + client.getUsername().substring(1);
            System.out.println("Welcome! " + welcomeName);
            return;
        }
    }
}
