package moneyDemo;

public enum MoneyType {
    THOUSAND("thousand"),
    FIVE_HUNDRED("five_hundred"),
    TWO_HUNDRED("two_hundred"),
    ONE_HUNDRED("one_hundred"),
    FIFTY("fifty"),
    TWENTY("twenty"),
    TEN("ten"),
    TWO("two"),
    ONE("one");

    public final String moneyName;

    MoneyType(String name){
        moneyName = name;
    }
}
