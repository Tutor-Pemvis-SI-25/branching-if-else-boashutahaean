import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a1, a2, hx, hj;

        a1 = Integer.parseInt(input.nextLine());
        a2 = Integer.parseInt(input.nextLine());
        if (a1 % 2 == 0) {
            System.out.println("bilangan pertama: genap");
        } else {
            System.out.println("bilangan pertama: ganjil");
        }
        if (a2 % 2 == 0) {
            System.out.println("bilangan kedua: genap");
        } else {
            System.out.println("bilangan kedua: ganjil");
        }
        if (a1 > a2) {
            System.out.println("bilangan pertama lebih besar");
        } else {
            if (a1 < a2) {
                System.out.println("bilangan kedua lebih besar");
            } else {
                System.out.println("kedua bilangan sama besar");
            }
        }
        if (a1 % 2 == 0 && a2 % 2 == 0) {
            hj = a1 + a2;
            System.out.println("hasil penjumlahan:" + hj);
        } else {
            if (a1 % 2 != 0 && a2 % 2 != 0) {
                hx = a1 * a2;
                System.out.println("hasil perkalian:" + hx);
            }
        }
        if (a1 % 2 != 0 && a2 % 2 == 0) {
            System.out.println("berbeda jenis");
        } else {
            if (a2 % 2 != 0 && a1 % 2 == 0) {
                System.out.println("berbeda jenis");
            }
        }
    }
}
