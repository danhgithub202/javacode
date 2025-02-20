import java.util.Scanner; // Thêm dòng này để import Scanner

public class kiemtrasonguyento {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào hai số a và b
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        System.out.println("Các số nguyên tố trong khoảng từ " + a + " đến " + b + " là:");

        // Lặp qua các số trong khoảng từ a đến b và kiểm tra xem có phải là số nguyên tố không
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
