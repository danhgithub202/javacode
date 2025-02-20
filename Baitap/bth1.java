import java.util.Scanner;

public class bth1 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        String lastName = nameParts[nameParts.length - 1];

        System.out.println("Ten: " + lastName);

        scanner.close();
    }
}
