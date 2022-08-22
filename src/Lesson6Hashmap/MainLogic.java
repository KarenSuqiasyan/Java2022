package Lesson6Hashmap;

import java.util.Scanner;
public class MainLogic {
    boolean isFinish = true;
    Scanner scanner = new Scanner(System.in);
    CurrencyMap currencyMap = new CurrencyMap();
    public void runMethod() {
        currencyMap.setCurrencyMapEnum();
        while (isFinish) {
            System.out.println("Wright Country name");
            CountryEnum countryEnum = null;
            try {
                countryEnum = CountryEnum.valueOf(scanner.next().toUpperCase());
            } catch (Exception e) {
                System.out.println("we have no such country");
                runMethod();
            }
            if (currencyMap.currencyMapEnum.containsKey(countryEnum)) {
                System.out.println(countryEnum + " currency " + currencyMap.currencyMapEnum.get(countryEnum));
            } else {
                System.out.println("wright currency of your country and we will add it on our DB");
                String currency = scanner.next();
                currencyMap.setCurrencyMapEnum(countryEnum, currency);
            }
            System.out.println("1. Continue\n2. Finish ");
            int num = scanner.nextInt();
            if (num == 2) {
                isFinish = false;
            }
        }
    }
}
