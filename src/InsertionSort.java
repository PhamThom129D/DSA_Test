public class InsertionSort {

    /*
     * Ma gia:
     * THUAT_TOAN InsertionSort(a)
     *     FOR i <- 1 TO DO_DAI(a) - 1 DO
     *         key <- a[i]
     *         j <- i - 1
     *
     *         WHILE j >= 0 DO
     *             IF a[j] > key THEN
     *                 a[j + 1] <- a[j]
     *                 j <- j - 1
     *             ELSE
     *                 THOAT_VONG_LAP
     *             END IF
     *         END WHILE
     *
     *         a[j + 1] <- key
     *     END FOR
     * KET_THUC
     */
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }
}
