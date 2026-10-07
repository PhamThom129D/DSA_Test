public class Factorial {

    /*
     * Ma gia:
     * 1. Neu n bang 0 hoac 1, tra ve 1 (dieu kien dung).
     * 2. Neu khong, tinh n nhan voi giai thua cua n - 1.
     * 3. De quy tiep tuc den khi cham dieu kien dung.
     */
    public static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}