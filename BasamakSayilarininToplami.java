import java.util.Scanner;

    public class BasamakSayilarininToplami {

        public static void main(String[] args) {
            int sayi ;
            int toplam = 0;

            Scanner input = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

            int temp = sayi ;
            while (temp > 0) {
                toplam += temp % 10;
                temp /= 10;
            }

            System.out.println(sayi + " Sayının basamaklarının toplamı: " + toplam);
        }
    }
