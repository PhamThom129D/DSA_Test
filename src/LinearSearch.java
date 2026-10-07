public class LinearSearch {

    /*
     * Ma gia:
     * THUAT_TOAN LinearSearch(a, x)
     *     i <- 0
     *     WHILE i < DO_DAI(a) DO
     *         IF a[i] = x THEN
     *             RETURN i
     *         ELSE
     *             i <- i + 1
     *         END IF
     *     END WHILE
     *     RETURN -1
     * KET_THUC
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
