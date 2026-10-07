public class InsertionSort {

    /*
     * Ma gia:
     * 1. Xem phan tu dau tien la doan mang da duoc sap xep.
     * 2. Voi moi phan tu tiep theo, luu gia tri do vao key.
     * 3. Doi cac phan tu lon hon key sang phai mot vi tri.
     * 4. Chen key vao vi tri trong vua tao ra.
     * 5. Lap lai den khi da xu ly het mang.
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