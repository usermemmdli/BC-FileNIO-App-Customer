package org.example.enums;

public enum OptionsEnum {
    SHOW_CARDS_CUSTOMER(1,"Sahib olduğun kartları göstər"),
    MONEY_TRANSFER(2,"Pul köçürməsi"),
    INCREASE_BALANCE_PHONE_NUMBER(3,"Telefon nömrəsinin balansının artır"),
    CHANGE_PASSWORD(4,"Parolu dəyiş");

    private final String description;
    private final int index;

    OptionsEnum(int index, String description ) {
        this.description = description;
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public int getIndex() {
        return index;
    }
    public static OptionsEnum getEnumByIndex(int index) {
        for (OptionsEnum optionsEnum : OptionsEnum.values()) {
            if (optionsEnum.index == index) {
                return optionsEnum;
            }
        }
        throw new IllegalArgumentException("Invalid option" + " " + index);
    }
}
