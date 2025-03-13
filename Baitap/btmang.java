import java.util.scanner;

public class btmang {
    public static void main(String[] args) {
        // Khai bao va khoi tao luon phan tu    
        int[]arr1 = { 2 , 3 , 1 , 6 , 0 };
        // khai bao va cung vap kich thuoc mang
        int[]arr2 = new int[5];
        // khai bao truoc va khoi tao sau
        int[]arr3;
        //...
        arr3 = new int[5];
        //* Truy suat cac phan tu cua mang
        // Cu phap: Ten_mang[chi_so_pt_can_tx]
        System.out.println(arr1[ 3 ]);
        //*Lay kich thuoc (do dai) cua mang
        System.out.print(arr1.length);
        // Vong lap for
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Chi so: " + i);
            System.out.println("Gia tri: " + arr1[i] );
            System.out.println("----------");

        //*Hien thi cac phan tu la so chan trong mang */   (for-each) 
        int[]arr4={2, 3, 5, 6, 9, 10, 12, 14, 15 };
        System.out.println(" Cac so chan trong mang la: ");
        
        for (int j : arr4) {
            if (j % 2 == 0) {
                System.out.println(j +"");
            }
        //*Bai tap */
        //Bai 1: Nhap mot mang so nguyen tu ban phim va in ra phan tu lon nhat, nho nhat trong mang.
        
        }

        

        }
     
    
    
    
    
    
    }
}
