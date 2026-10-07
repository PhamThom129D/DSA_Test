public class Factorial {

    /*
     * Ma gia:
     * THUAT_TOAN Factorial(n)
     *     IF n = 0 HOAC n = 1 THEN
     *         RETURN 1
     *     ELSE
     *         RETURN n * Factorial(n - 1)
     *     END IF
     * KET_THUC
     */
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
