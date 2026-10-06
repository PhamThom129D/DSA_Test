# Bài tập thuật toán

Chương trình Java chạy trên dòng lệnh, tổng hợp một số thuật toán sắp xếp, tìm kiếm và đệ quy. Khi khởi động, chương trình hiển thị menu để chọn chức năng.

## Chức năng

1. **Sắp xếp chèn (Insertion Sort):** sắp xếp mảng số nguyên tăng dần.
2. **Tìm kiếm tuyến tính (Linear Search):** tìm giá trị trong mảng và thông báo vị trí (bắt đầu từ 1).
3. **Sắp xếp nổi bọt (Bubble Sort):** sắp xếp mảng số nguyên tăng dần.
4. **Tính giai thừa:** tính `n!` bằng đệ quy; không chấp nhận số âm.
5. **Dãy Fibonacci:** in `n` số đầu tiên bằng đệ quy, từ `F(1)` đến `F(n)`.
0. **Thoát** chương trình.

## Yêu cầu

- JDK (Java Development Kit) đã cài đặt.
- Có thể chạy lệnh `java` và `javac` từ Terminal/PowerShell.

Kiểm tra cài đặt:

```powershell
java -version
javac -version
```

## Biên dịch và chạy

Mở Terminal tại thư mục gốc dự án, nơi chứa thư mục `src`, rồi chạy:

```powershell
New-Item -ItemType Directory -Force bin
javac -d bin src\*.java
java -cp bin App
```

Sau đó nhập số tương ứng trên menu. Ví dụ, chọn `5`, nhập `5` để in năm số Fibonacci đầu tiên.

## Cấu trúc dự án

.
├── src/
│   ├── App.java
│   ├── BubbleSort.java
│   ├── Factorial.java
│   ├── Fibonacci.java
│   ├── InsertionSort.java
│   └── LinearSearch.java
└── README.md
