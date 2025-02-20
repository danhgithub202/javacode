import java.util.Scanner;

public class nxdulieu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine(); // Thêm dòng này để loại bỏ ký tự xuống dòng

        System.out.print("Nhap ho ten: ");
        String ten = sc.nextLine();

        System.out.println("Ban vua nhap tuoi: " + tuoi);
        System.out.println("Ban vua nhap ho ten: " + ten);

        sc.close(); // Đóng Scanner để tránh rò rỉ bộ nhớ
    }
}
