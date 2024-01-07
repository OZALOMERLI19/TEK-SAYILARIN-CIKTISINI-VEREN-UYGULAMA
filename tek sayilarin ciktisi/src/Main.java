import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[10];
        int[] teksayilar;


        System.out.println("Lutfen 10 adet dizi elemanini giriniz:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Dizinin " + (i + 1) + "." + " elemanini giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        int teksayiAdedi = 0;
        for (int i = 0; i < 10; i++) {
            if (dizi[i] % 2 != 0) {
                teksayiAdedi++;
            }
        }

        teksayilar = new int[teksayiAdedi];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (dizi[i] % 2 != 0) {
                teksayilar[index] = dizi[i];
                index++;
            }
        }

        System.out.println("Tek Sayilar");
        for (int i = 0; i < teksayilar.length; i++) {
            System.out.println("Tek sayilar = " + teksayilar[i] + "");
        }


    }
}
