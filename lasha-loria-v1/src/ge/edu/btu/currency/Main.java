package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;

import java.util.logging.Logger;

public class Main extends CurrencyServiceImpl {
    final static Logger logger=Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        CurrencyServiceImpl currencyService = new CurrencyServiceImpl();


        currencyService.convert(2.5);
        logger.info("Result");
    }
}
