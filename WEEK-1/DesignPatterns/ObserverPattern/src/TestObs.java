public class TestObs {
    public static void main(String[] args) throws Exception {
        StockMarket stockMarket = new StockMarket();
        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");
        stockMarket.register(mobileApp);
        stockMarket.register(webApp);
        stockMarket.update("CTS stock price increased!");
        stockMarket.update("ACC stock price decreased!");
        stockMarket.deregister(mobileApp);
        stockMarket.update("ADANI stock price is stable.");
    }
}
