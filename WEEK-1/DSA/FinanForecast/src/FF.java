public class FF {

    public static double cFV(double[] growthRates, int n, double initialValue) {
        if (n == 0) {
            return initialValue;
        }
        return cFV(growthRates, n - 1, initialValue) * (1 + growthRates[n - 1]);
    }

    public static double calFutureValueOptimized(double[] growthRates, int n, double initialValue, Double[] memo) {
        if (n == 0) {
            return initialValue;
        }
        if (memo[n] != null) {
            return memo[n];
        }
        memo[n] = calFutureValueOptimized(growthRates, n - 1, initialValue, memo) * (1 + growthRates[n - 1]);
        return memo[n];
    }
}