
import java.util.Scanner;

public class App {

    /*
     * Ma gia:
     * 1. Tao Scanner de doc du lieu tu ban phim.
     * 2. Lap va hien thi menu cho den khi nguoi dung chon 0.
     * 3. Doc lua chon va goi ham xu ly tuong ung.
     * 4. Bao loi neu lua chon khong hop le.
     * 5. Dong Scanner sau khi thoat vong lap.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println();
            System.out.println("=================================");
            System.out.println("       BAI TAP THUAT TOAN");
            System.out.println("=================================");
          
            System.out.println("1. Tim kiem tuyen tinh (Linear Search)");
            System.out.println("2. Sap xep chen (Insertion Sort)");
            System.out.println("3. Tinh giai thua (De quy)");  
        
            System.out.println("0. Thoat");
            System.out.println("=================================");

            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {


                case 1:
                    linearSearch(sc);
                    break;
                       
                case 2:
                    insertionSort(sc);
                    break;

                case 3:
                    factorial(sc);
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }



    /*
     * Ma gia:
     * 1. Doc so luong phan tu va cac gia tri cua mang.
     * 2. Doc gia tri x can tim.
     * 3. Goi LinearSearch.linearSearch de tim vi tri cua x.
     * 4. Neu ket qua khac -1, in vi tri tim thay (bat dau tu 1).
     * 5. Neu khong, thong bao khong tim thay x.
     */
    public static void linearSearch(Scanner sc) {

        System.out.println();
        System.out.println("===== CAU 1: LINEAR SEARCH =====");

        System.out.print("Nhap so phan tu n = ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Nhap gia tri can tim: ");
        int x = sc.nextInt();

        int result = LinearSearch.linearSearch(a, x);

        if (result != -1) {
            System.out.println(
                    "Tim thay " + x + " tai vi tri " + (result + 1)
            );
        } else {
            System.out.println(
                    "Khong tim thay " + x + " trong mang."
            );
        }
    }
    /*
     * Ma gia:
     * 1. Doc so luong phan tu va cac gia tri cua mang.
     * 2. Goi InsertionSort.insertionSort de sap xep mang tang dan.
     * 3. In cac phan tu sau khi sap xep.
     */
    public static void insertionSort(Scanner sc) {

        System.out.println();
        System.out.println("===== CAU 2: INSERTION SORT =====");

        System.out.print("Nhap so phan tu n = ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        InsertionSort.insertionSort(a);

        System.out.println("Mang sau khi sap xep:");

        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println();
    }


    /*
     * Ma gia:
     * 1. Doc so nguyen n.
     * 2. Neu n nho hon 0, thong bao khong the tinh va ket thuc ham.
     * 3. Nguoc lai, goi Factorial.factorial de tinh n!.
     * 4. In ket qua.
     */
    public static void factorial(Scanner sc) {

        System.out.println();
        System.out.println("===== CAU 3: FACTORIAL =====");

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Khong the tinh giai thua so am.");
            return;
        }

        long result = Factorial.factorial(n);

        System.out.println(n + "! = " + result);
    }

}
