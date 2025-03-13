import java.util.Scanner;

class KiemTraChuoiDoiXung {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");

        String inputString = scanner.nextLine();

        // Loại bỏ khoảng trắng và chuyển về chữ thường
        inputString = inputString.replaceAll("\\s+", "").toLowerCase();

        // Đảo ngược chuỗi
        String reverseString = "";
        int length = inputString.length();

        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }

        // So sánh chuỗi gốc và chuỗi đảo ngược
        if (inputString.equals(reverseString)) {
            System.out.println("Day la chuoi doi xung!");
        } else {
            System.out.println("Day khong phai la chuoi doi xung!");
        }

        scanner.close();
    }
}
