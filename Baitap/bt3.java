import java.util.*; 

public class bt3 {      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String[] words = input.split(" ");
        
        System.out.println("Mang ket qua:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
    