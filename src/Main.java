import java.util.Scanner;
//VMA9
public class Main {
    public static void main(String[] args) {
        int n, total = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("*Çift ve 4'e tam bölünen sayıları toplar.*");

        do {
            System.out.print("Sayı Giriniz : ");
            n = input.nextInt();
            if (n % 4 == 0 || n % 2 == 0) {
                total += n;
            }

        } while (n % 2 == 0);

        System.out.print("Toplam : " + total);
        System.out.print("Program Bitti. ");
    }
}