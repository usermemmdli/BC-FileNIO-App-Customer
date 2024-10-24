package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Credentials {

    public static void login( ) throws IOException {

        String username = "Mustafa";
        String password = "C:\\Users\\Mustafa\\JavaFile\\password.txt";


        Scanner scanner = new Scanner(System.in);
        System.out.println("İstifadəçi adı və parol daxil edin -->");
        System.out.print("username: ");
        String usernameSc = scanner.next();
        System.out.print("password: ");
        String passwordSc = scanner.next();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(password));

        if (username.equals(usernameSc) && bufferedReader.readLine().equals(passwordSc)) {
            System.out.println("Giris olundu!");
        } else {
            System.err.println("Yanlış istifadəçi adı və ya parol!");
            login();
        }
    }
}
