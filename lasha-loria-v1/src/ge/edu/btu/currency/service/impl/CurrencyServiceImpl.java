package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {


    @Override
    public void convert(double amount) {
        double dolar = 3.14;
        double converted = amount * dolar;
        System.out.println("to dolars: " + converted);
    }




    @Override
    public void setExchangeRate(double value) {
        double New = value;
    }
}
