/**
 * Created by alistem on 19.9.15.
 */

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.ExchangeFactory;
import com.xeiam.xchange.anx.v2.ANXExchange;
import com.xeiam.xchange.bitbay.BitbayExchange;
import com.xeiam.xchange.bitcoinaverage.BitcoinAverageExchange;
import com.xeiam.xchange.currency.CurrencyPair;
import com.xeiam.xchange.dto.marketdata.Ticker;
import com.xeiam.xchange.service.polling.marketdata.PollingMarketDataService;

import java.io.IOException;
import java.util.List;
public class Test {

    public static void main(String[] args) throws IOException {
        System.out.println("ANXExchange");
        getTickersByClassName(ANXExchange.class.getName());
        System.out.println("BitbayExchange");
        getTickersByClassName(BitbayExchange.class.getName());
        getTickersByClassName(BitcoinAverageExchange.class.getName());
//        getTickersByClassName(ANXExchange.class.getName());
//        getTickersByClassName(ANXExchange.class.getName());
//        getTickersByClassName(ANXExchange.class.getName());
    }

    private static List<Ticker> getTickersByClassName(String name) throws IOException {

        Exchange anx = ExchangeFactory.INSTANCE.createExchange(name);
        PollingMarketDataService marketDataService = anx.getPollingMarketDataService();
//        anx.remoteInit();
        List<CurrencyPair> pairList = marketDataService.getExchangeSymbols();
        for(CurrencyPair pair : pairList){
            System.out.println(marketDataService.getTicker(pair));
        }
        return null;
    }
}
