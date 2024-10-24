package org.example.strategy;

import org.example.enums.OptionsEnum;

public class StrategyFactory {
    public static AbstractCustomerStrategy getStrategyByOption(OptionsEnum optionsEnum) {
        return switch (optionsEnum) {
            case SHOW_CARDS_CUSTOMER -> new ShowCardsCustomerStrategy();
            case MONEY_TRANSFER -> new MoneyTransferStrategy();
            case INCREASE_BALANCE_PHONE_NUMBER -> new IncreaseBalancePhoneNumberStrategy();
            case CHANGE_PASSWORD -> new ChangePasswordStrategy();
        };
    }
}
