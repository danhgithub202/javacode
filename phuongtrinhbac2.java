public class phuongtrinhbac2 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 10;
        int c = 10;

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                double x = -c / (double) b;
                System.out.println("Phuong trinh co nghiem duy nhat: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2.0 * a);
                System.out.println("Phuong trinh co nghiep kep: x = " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem !");
            }
        }
    }
}
