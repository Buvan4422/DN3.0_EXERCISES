public class Algos {

    public static void bubbleSort(Ordr[] ords) {
        int n = ords.length;
        boolean swp;
        for (int i = 0; i < n - 1; i++) {
            swp = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (ords[j].getTotalPrice() > ords[j + 1].getTotalPrice()) {
                    Ordr tmp = ords[j];
                    ords[j] = ords[j + 1];
                    ords[j + 1] = tmp;
                    swp = true;
                }
            }
            if (!swp) break;
        }
    }

    public static void quickSort(Ordr[] ords, int l, int h) {
        if (l < h) {
            int p = partition(ords, l, h);
            quickSort(ords, l, p - 1);
            quickSort(ords, p + 1, h);
        }
    }

    private static int partition(Ordr[] ords, int l, int h) {
        double pvot = ords[h].getTotalPrice();
        int i = (l - 1);
        for (int j = l; j < h; j++) {
            if (ords[j].getTotalPrice() <= pvot) {
                i++;
                Ordr tmp = ords[i];
                ords[i] = ords[j];
                ords[j] = tmp;
            }
        }
        Ordr tmp = ords[i+1];
        ords[i+1] = ords[h];
        ords[h] = tmp;
        return i + 1;
    }
}