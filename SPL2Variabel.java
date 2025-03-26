import java.util.Scanner;

public class SPL2Variabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a1, b1, c1, a2, b2, c2;
        char jawab;

        do {
            System.out.print("Masukkan koefisien a1: ");
            a1 = input.nextFloat();
            System.out.print("Masukkan koefisien b1: ");
            b1 = input.nextFloat();
            System.out.print("Masukkan koefisien c1: ");
            c1 = input.nextFloat();

            System.out.print("Masukkan koefisien a2: ");
            a2 = input.nextFloat();
            System.out.print("Masukkan koefisien b2: ");
            b2 = input.nextFloat();
            System.out.print("Masukkan koefisien c2: ");
            c2 = input.nextFloat();

            float D = a1 * b2 - a2 * b1;

            if (D == 0) {
                System.out.println("Sistem persamaan tidak memiliki solusi unik.");
            } else {
                float Dx = c1 * b2 - c2 * b1;
                float Dy = a1 * c2 - a2 * c1;
                float x = Dx / D;
                float y = Dy / D;
                System.out.println("Solusi sistem persamaan linear:");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }

            System.out.print("Apakah ingin melakukan proses lagi (Y/N)? ");
            jawab = input.next().charAt(0);

            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

        } while (jawab == 'Y' || jawab == 'y');

        input.close();
    }
}