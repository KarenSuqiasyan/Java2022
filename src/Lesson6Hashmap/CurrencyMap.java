package Lesson6Hashmap;

import java.util.HashMap;

public class CurrencyMap {
    HashMap<CountryEnum, String> currencyMapEnum = new HashMap<>();

    public void setCurrencyMapEnum(CountryEnum countryEnum, String currency) {
        currencyMapEnum.put(countryEnum, currency);
    }
    public void setCurrencyMapEnum() {
        currencyMapEnum.put(CountryEnum.ARMENIA, "AMD");
        currencyMapEnum.put(CountryEnum.USA, "USD");
    }
}
