import java.util.Scanner;

public class KiemTraMatKhau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mat khaukhau: ");
        String password = scanner.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%&*]).{8,}$";

        if (password.matches(regex)) {
            System.out.println("Mat khau manh!");
        } else {
            System.out.println("Mat khau yeu!");
        }
        
        scanner.close();
    }
}
