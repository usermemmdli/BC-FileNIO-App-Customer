package org.example.strategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ShowCardsCustomerStrategy implements AbstractCustomerStrategy {
    @Override
    public void process() {

        System.out.println("Kartin ID-sini daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int IDCard = scanner.nextInt();

        String filePath = "C:\\Users\\Mustafa\\JavaFile\\tempCard.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String setir;
            int setirNomresi = 0;
            while ((setir = bufferedReader.readLine()) != null) {
                setirNomresi++;
                if (setirNomresi == IDCard) {
                    System.err.println("Kart melumatlari: " + setir);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
