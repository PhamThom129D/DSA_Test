public class LinearSearch {

    /*
     * Ma gia:
     * 1. Duyet mang tu phan tu dau tien den phan tu cuoi cung.
     * 2. Neu phan tu tai vi tri i bang x, tra ve i ngay lap tuc.
     * 3. Neu duyet het mang ma khong gap x, tra ve -1.
     */
    public static int linearSearch(int[] a, int x) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == x) {
                return i;
            }
        }

        return -1;
    }
}