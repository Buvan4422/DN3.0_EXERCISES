import java.util.Arrays;
import java.util.Comparator;

public class Search{
    public static Product linearSearch(Product[] prds, String prdName) {
        for (Product prd : prds) {
            if (prd.getProdName().equalsIgnoreCase(prdName)) {
                return prd;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] prds, String prdName) {
        Arrays.sort(prds, Comparator.comparing(Product::getProdName));
        int l = 0;
        int r = prds.length - 1;

        while (l <= r)
        {
            int m = l+(r-l)/2;
            int cmp = prds[m].getProdName().compareToIgnoreCase(prdName);

            if (cmp == 0) 
                return prds[m];
            if (cmp < 0) 
                l = m + 1;
            else
                r = m - 1;
        }
        return null;
    }
}