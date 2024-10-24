package org.example.util;

import org.example.enums.OptionsEnum;

import java.util.Scanner;

public class OptionsEnumUtil {
    public static void printOptions(){
        OptionsEnum[] optionsEnums = OptionsEnum.values();
        System.out.println("******************************************");
        for (OptionsEnum optionsEnum : optionsEnums){
            System.out.println(optionsEnum.getIndex()+ "." +optionsEnum.getDescription());
        }
        System.out.println("******************************************");
    }
    public static int chooseOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmasa seçim edin -->");
        int index = scanner.nextInt();
        OptionsEnum.getEnumByIndex(index);
        return index;
    }
}
