package org.example;

import org.example.enums.OptionsEnum;
import org.example.strategy.AbstractCustomerStrategy;
import org.example.strategy.StrategyFactory;
import org.example.util.OptionsEnumUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Credentials.login();
        while (true) {
            OptionsEnumUtil.printOptions();
            OptionsEnum optionsEnum = OptionsEnum.getEnumByIndex(OptionsEnumUtil.chooseOption());
            AbstractCustomerStrategy strategy = StrategyFactory.getStrategyByOption(optionsEnum);
            strategy. process();
        }
    }
}