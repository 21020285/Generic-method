public class Week11 {
    public static <T extends Comparable> List<T> sortGeneric (List<T> arr) {
        genericSort(arr, T);
        return arr;
    }

    public static <T> void genericSort(T[] arr, Comparator<> comparator) {
        T swap;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[i], arr[j]) > 0) {
                    swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;
                }
            }
        }
    }
}

