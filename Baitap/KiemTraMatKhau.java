import java.util.Scanner;

public class KiemTraMatKhau {
    public static boolean laMatKhauManh(String matKhau) {
        if (matKhau.length() < 8) return false; // Kiểm tra độ dài
        
        boolean coChuHoa = false, coChuThuong = false, coSo = false, coKyTuDacBiet = false;
        String kyTuDacBiet = "@#$%&*";

        // Duyệt từng ký tự trong mật khẩu
        for (char c : matKhau.toCharArray()) {
            if (Character.isUpperCase(c)) coChuHoa = true;     // Chữ hoa
            if (Character.isLowerCase(c)) coChuThuong = true;  // Chữ thường
            if (Character.isDigit(c)) coSo = true;             // Chữ số
            if (kyTuDacBiet.contains(String.valueOf(c))) coKyTuDacBiet = true; // Ký tự đặc biệt
        }

        return coChuHoa && coChuThuong && coSo && coKyTuDacBiet;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mat khau: ");
        String matKhau = scanner.nextLine();
        scanner.close();

        if (laMatKhauManh(matKhau)) {
            System.out.println(" Mat khau manhmanh!");
        } else {
            System.out.println("Mat khau yeu! Phai co it nhat 8 ki tu, chu hoa, chu thuong, so va ky tu dac biet.");
        }
    }
}
