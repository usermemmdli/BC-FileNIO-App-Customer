package org.example.strategy;

import java.io.*;
import java.util.Scanner;

public class ChangePasswordStrategy implements AbstractCustomerStrategy {
    @Override
    public void process() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cari parol:");
        String currentPassword = scanner.next();
        System.out.println("Yeni parol:");
        String newPassword = scanner.next();

        String filePath = "C:\\Users\\Mustafa\\JavaFile\\password.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String password = bufferedReader.readLine();
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));

        if (password.equals(currentPassword)) {
            bufferedWriter.write(newPassword);
            bufferedWriter.close();
            System.out.println("<Parol deyisdirildi>");
        } else {
            System.out.println("<Cari parol yanlisdir>");
            process();
        }
    }
}