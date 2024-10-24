package org.example.strategy;

import java.io.*;
import java.util.Scanner;

public class MoneyTransferStrategy implements AbstractCustomerStrategy {
    @Override
    public void process() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Odemek-->");
        System.out.println("Kartin nomresi: ");
        String cardNumber1 = scanner.next();
        System.out.println("Kartin CVV nomresi: ");
        String cvvNumber = scanner.next();

        System.out.println("Medaxil etmek-->");
        System.out.println("Kartin nomresi: ");
        String cardNumber2 = scanner.next();
        System.out.println("Mebleg: ");
        String amount = scanner.next();

        String filePath1 = "C:\\Users\\Mustafa\\JavaFile\\tempCard.txt";
        File inputFile1 = new File(filePath1);
        String filePath2 = "C:\\Users\\Mustafa\\JavaFile\\transactions.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2, true));
        String setir;
        while ((setir = bufferedReader.readLine()) != null) {
            if (setir.contains(cardNumber1) && setir.contains(cvvNumber) && !setir.contains("blocked")) {
                bufferedWriter.newLine();
                bufferedWriter.write(setir + "-" + amount + " AZN >>transactions>> ");
                bufferedWriter.write(cardNumber2 + " --> +" + amount + " AZN");
                System.out.println("Ugurlu emeliyyat! ");
            } else if (setir.contains("blocked")) {
                System.out.println("<Kart bloklanib>");
            }
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}