public class App {
    public static void main(String[] args) {
        double[] gr = {0.5, 0.01, 1.07, 0.02}; 
        double iv = 1000.0; 
        int n = gr.length;

        double fv = FF.cFV(gr, n, iv);
        System.out.println("Future Value (Recursive): " + fv);

        Double[] memo = new Double[n + 1];
        double fVO = FF.calFutureValueOptimized(gr, n, iv, memo);
        System.out.println("Future Value (Optimized Recursive): " + fVO);
    }
}
