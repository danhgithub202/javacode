import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        // Nhập ký tự cần đếm
        System.out.print("Nhap ky tu can dem: ");
        char kyTu = scanner.next().charAt(0);

        // Đếm số lần xuất hiện của ký tự
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        // Hiển thị kết quả
        if (count > 0) {
            System.out.println("Ky tu '" + kyTu + "' Xuat hien " + count + " Lan trong chuoi.");
        } else {
            System.out.println("Ky tu khong co trong chuoi.");
        }

        scanner.close();
    }
}
