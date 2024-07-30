public class OrdsSort {
    public static void main(String[] args) {
        Ordr[] orders = {
            new Ordr(1, "Zara", 125.00),
            new Ordr(2, "Tom", 275.75),
            new Ordr(3, "Anna", 60.40),
            new Ordr(4, "Mike", 420.00),
            new Ordr(5, "Emma", 350.20)
        };

        // Bubble Sort
        System.out.println("Ordrs sorted by Bubble Sort:");
        Algos.bubbleSort(orders);
        for (Ordr order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        Ordr[] ordersForQuickSort = {
            new Ordr(1, "Zara", 125.00),
            new Ordr(2, "Tom", 275.75),
            new Ordr(3, "Anna", 60.40),
            new Ordr(4, "Mike", 420.00),
            new Ordr(5, "Emma", 350.20)
        };

        System.out.println("\nOrdrs sorted by Quick Sort:");
        Algos.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        for (Ordr order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}
