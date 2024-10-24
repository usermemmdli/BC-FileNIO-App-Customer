package org.example.strategy;

import java.io.*;
import java.util.Scanner;

public class IncreaseBalancePhoneNumberStrategy implements AbstractCustomerStrategy {
    @Override
    public void process() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nomrenin balansini artirmaq-->");
        System.out.println("Kartin nomresi: ");
        String cardNumber = scanner.next();
        System.out.println("Kartin CVV nomresi: ");
        String cvvNumber = scanner.next();
        System.out.println("Telefon nomresi: ");
        String phoneNumber = scanner.next();
        System.out.println("Mebleg: ");
        String amount = scanner.next();

        String filePath1 = "C:\\Users\\Mustafa\\JavaFile\\tempCard.txt";
        File inputFile = new File(filePath1);
        String filePath2 = "C:\\Users\\Mustafa\\JavaFile\\transactions.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2, true));

        String setir;
        bufferedWriter.newLine();
        while ((setir = bufferedReader.readLine()) != null) {
            if (setir.contains(cardNumber) && setir.contains(cvvNumber) && !setir.contains("blocked")) {
                bufferedWriter.write(setir + "-" + amount + " AZN >>IncreaseBalancePhoneNumber>> " + phoneNumber + " +" + amount);
                System.out.println("Ugurlu emeliyyat! ");
            } else if (setir.contains("blocked")){
                System.out.println("<Kart bloklanib>");
            }
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
