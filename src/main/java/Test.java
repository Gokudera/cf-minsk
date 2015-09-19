/**
 * Created by alistem on 19.9.15.
 */

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.ExchangeFactory;
import com.xeiam.xchange.anx.v2.ANXExchange;
import com.xeiam.xchange.bitbay.BitbayExchange;
import com.xeiam.xchange.bitcoinaverage.BitcoinAverageExchange;
import com.xeiam.xchange.bitcoincharts.BitcoinChartsExchange;
import com.xeiam.xchange.bitcoinde.BitcoindeExchange;
import com.xeiam.xchange.bitcoinium.BitcoiniumExchange;
import com.xeiam.xchange.bitcurex.BitcurexExchange;
import com.xeiam.xchange.bitfinex.v1.BitfinexExchange;
import com.xeiam.xchange.bitkonan.BitKonanExchange;
import com.xeiam.xchange.bitmarket.BitMarketExchange;
import com.xeiam.xchange.bitso.BitsoExchange;
import com.xeiam.xchange.bitstamp.BitstampExchange;
import com.xeiam.xchange.bittrex.v1.BittrexExchange;
import com.xeiam.xchange.bleutrade.BleutradeExchange;
import com.xeiam.xchange.blockchain.BlockchainExchange;
import com.xeiam.xchange.btc38.Btc38Exchange;
import com.xeiam.xchange.btccentral.BTCCentralExchange;
import com.xeiam.xchange.btcchina.BTCChinaExchange;
import com.xeiam.xchange.btce.v3.BTCEExchange;
import com.xeiam.xchange.btctrade.BTCTradeExchange;
import com.xeiam.xchange.bter.BTERExchange;
import com.xeiam.xchange.campbx.CampBXExchange;
import com.xeiam.xchange.cexio.CexIOExchange;
import com.xeiam.xchange.clevercoin.CleverCoinExchange;
import com.xeiam.xchange.coinbase.CoinbaseExchange;
import com.xeiam.xchange.coinbaseex.CoinbaseExExchange;
import com.xeiam.xchange.coinfloor.CoinfloorExchange;
import com.xeiam.xchange.coinmate.CoinmateExchange;
import com.xeiam.xchange.coinsetter.CoinsetterExchange;
import com.xeiam.xchange.cointrader.CointraderExchange;
import com.xeiam.xchange.cryptonit.v2.CryptonitExchange;
import com.xeiam.xchange.cryptsy.CryptsyExchange;
import com.xeiam.xchange.currency.CurrencyPair;
import com.xeiam.xchange.dto.marketdata.Ticker;
import com.xeiam.xchange.empoex.EmpoExExchange;
import com.xeiam.xchange.hitbtc.HitbtcExchange;
import com.xeiam.xchange.huobi.HuobiExchange;
import com.xeiam.xchange.independentreserve.IndependentReserveExchange;
import com.xeiam.xchange.itbit.v1.ItBitExchange;
import com.xeiam.xchange.jubi.JubiExchange;
import com.xeiam.xchange.kraken.KrakenExchange;
import com.xeiam.xchange.lakebtc.LakeBTCExchange;
import com.xeiam.xchange.loyalbit.LoyalbitExchange;
import com.xeiam.xchange.mercadobitcoin.MercadoBitcoinExchange;
import com.xeiam.xchange.mexbt.MeXBTExchange;
import com.xeiam.xchange.oer.OERExchange;
import com.xeiam.xchange.okcoin.OkCoinExchange;
import com.xeiam.xchange.poloniex.PoloniexExchange;
import com.xeiam.xchange.quoine.QuoineExchange;
import com.xeiam.xchange.ripple.RippleExchange;
import com.xeiam.xchange.service.polling.marketdata.PollingMarketDataService;
import com.xeiam.xchange.taurus.TaurusExchange;
import com.xeiam.xchange.therock.TheRockExchange;
import com.xeiam.xchange.vircurex.VircurexExchange;
import com.xeiam.xchange.virtex.v2.VirtExExchange;
import com.xeiam.xchange.yacuna.YacunaExchange;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    private static List<String> unsuccess = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        List<String> exchanges = new ArrayList<String>(
                Arrays.asList(ANXExchange.class.getName(),
                        BitbayExchange.class.getName(),
                        BitcoinAverageExchange.class.getName(),
                        BitcoinChartsExchange.class.getName(),
                        BitcoindeExchange.class.getName(),
                        BitcoiniumExchange.class.getName(),
                        BitcurexExchange.class.getName(),
                        BitfinexExchange.class.getName(),
                        BitKonanExchange.class.getName(),
                        BitMarketExchange.class.getName(),
                        BitsoExchange.class.getName(),
                        BitstampExchange.class.getName(),
                        BittrexExchange.class.getName(),
                        BleutradeExchange.class.getName(),
                        BlockchainExchange.class.getName(),
                        Btc38Exchange.class.getName(),
                        BTCCentralExchange.class.getName(),
                        BTCChinaExchange.class.getName(),
                        BTCEExchange.class.getName(),
                        BTCTradeExchange.class.getName(),
                        BTERExchange.class.getName(),
                        CampBXExchange.class.getName(),
                        CexIOExchange.class.getName(),
                        CleverCoinExchange.class.getName(),
                        CoinbaseExchange.class.getName(),
                        CoinbaseExExchange.class.getName(),
                        CoinfloorExchange.class.getName(),
                        CoinmateExchange.class.getName(),
                        CoinsetterExchange.class.getName(),
                        CointraderExchange.class.getName(),
                        CryptonitExchange.class.getName(),
                        CryptsyExchange.class.getName(),
                        EmpoExExchange.class.getName(),
                        HitbtcExchange.class.getName(),
                        HuobiExchange.class.getName(),
                        IndependentReserveExchange.class.getName(),
                        ItBitExchange.class.getName(),
                        JubiExchange.class.getName(),
                        KrakenExchange.class.getName(),
                        LakeBTCExchange.class.getName(),
                        LoyalbitExchange.class.getName(),
                        MercadoBitcoinExchange.class.getName(),
                        MeXBTExchange.class.getName(),
                        OERExchange.class.getName(),
                        OkCoinExchange.class.getName(),
                        PoloniexExchange.class.getName(),
                        QuoineExchange.class.getName(),
                        RippleExchange.class.getName(),
                        TaurusExchange.class.getName(),
                        TheRockExchange.class.getName(),
                        VircurexExchange.class.getName(),
                        VirtExExchange.class.getName(),
                        YacunaExchange.class.getName())
        );

        for (String name : exchanges) {
            getTickersByClassName(name);
        }
        System.out.println("UNSUCCESS");
        for (String name : unsuccess) {
            System.out.println(name);
        }
    }

    private static List<Ticker> getTickersByClassName(String name) {
        try {
            System.out.println(name + ": ");
            Exchange anx = ExchangeFactory.INSTANCE.createExchange(name);
            PollingMarketDataService marketDataService = anx.getPollingMarketDataService();
            List<CurrencyPair> pairList = marketDataService.getExchangeSymbols();
            for (CurrencyPair pair : pairList) {
                System.out.println(marketDataService.getTicker(pair));
            }
        } catch (Exception ex) {
            unsuccess.add(name);
        }
        return null;
    }
}