import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a1, a2, hx, hj;

        a1 = Integer.parseInt(input.nextLine());
        a2 = Integer.parseInt(input.nextLine());
        if (a1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (a2 % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (a1 > a2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (a1 < a2) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (a1 % 2 == 0 && a2 % 2 == 0) {
            hj = a1 + a2;
            System.out.println("Hasil penjumlahan:" + hj);
        } else {
            if (a1 % 2 != 0 && a2 % 2 != 0) {
                hx = a1 * a2;
                System.out.println("Hasil perkalian:" + hx);
            }
        }
        if (a1 % 2 != 0 && a2 % 2 == 0) {
            System.out.println("Berbeda jenis");
        } else {
            if (a2 % 2 != 0 && a1 % 2 == 0) {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
