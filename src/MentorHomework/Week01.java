package MentorHomework;

import java.util.Scanner;

public class Week01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalıştırmak istediğiniz görev numarasını girin (1-10): ");
        int task = scanner.nextInt();

        switch (task) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            case 5:
                task5();
                break;
            case 6:
                task6();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            case 9:
                task9();
                break;
            case 10:
                task10();
                break;
            default:
                System.out.println("Geçersiz görev numarası!");
        }
        scanner.close();
    }
    //===================================000
    public static void task1() {
        // Soru 1: Sayının rakamlarının toplamı
        //Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz..");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int rakamlarToplami = 0 ;


        while ( sayi > 0 ){

            rakamlarToplami += sayi % 10;
            sayi /= 10;

        }

        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);

      //  int sayi = 34 ;
      //  int toplam = 0;

      //  while ( sayi>0){
      //      toplam += sayi%10 ;
      //      sayi/=10 ;
        }
        //System.out.println("verilen sayinin rakamlari toplami: " + toplam);

    //===========================================001 sonu

    //    Soru:2 1 den 20 ye kadar tam sayıları
    //    alt alta yazan Java kodu yazınız.
    //    Hint: For döngüsü kullanınız.
    public static void task2() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
    //===========================================002 sonu
    // Görev 3: 5'in çarpım tablosu
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("çarpım tablosu dökümü için bir sayı giriniz..");
        int girilenSayi = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(girilenSayi + " x " + i + " = " + (girilenSayi * i));
        }
    }
    //===========================================003 sonu

    // Görev 4: 1 den 10 a kadar her satırda bir artırarak
    // aşağıdaki şekli oluşturan Java kodunu yazınız.
    // Şekilli yazdırma (1, 12, 123, ...)
    public static void task4() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //===========================================004 sonu

    // Görev 5:Aşağıdaki elmas deseni görüntüsünü
    // çizen java kodunu yazınız.
    // Elmas deseni
    public static void task5() {
        int length = 7;
        // Üst yarı
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Alt yarı
        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //===========================================005 sonu

    // Görev 6:Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    //        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    //        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    //        Sesli harfler: a,e,i,o,u
    // Sesli/sessiz harf kontrolü
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz: ");
        String harf = scanner.nextLine();

        if (harf.length() != 1 || !Character.isLetter(harf.charAt(0))) {
            System.out.println("Yanlış karakter girdiniz!");
        } else {
            char ch = harf.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " harfi sesli harftir.");
            } else {
                System.out.println(ch + " harfi sessiz harftir.");
            }
        }
    }
    //===========================================006 sonu

    // Görev 7:Girilen bir sayının  ugly number olup olmadığını
    // kontrol etmek için bir Java programı yazın.
    // Ugly Number kontrolü :Sayı sisteminde,  ugly number  sadece
    // asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    // İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Ugly number değildir.");
            return;
        }

        int temp = number;
        while (temp % 2 == 0) // sayinin modulunu 2 ye göre al kalan 1 olana kadar devam et
              { temp /= 2; }
        while (temp % 3 == 0)
              {temp /= 3;}
        while (temp % 5 == 0)
              {temp /= 5;}

        if (temp == 1) { // modulden kalan 1 ise
            System.out.println(number + " ugly number.");
        } else { // modulden kalan 1 degilse
            System.out.println(number + " ugly number değildir.");
        }
    }
    //===========================================007  sonu

    // Görev 8: String'i tersten yazdırma
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();


        String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);
        }
        System.out.println("Verilen metnin tersten yazisilisi : " + tersMetin);

    }
    //===========================================008 sonu

    // Görev 9: String birleştirme
    public static void task9() {
        Scanner scanner = new Scanner(System.in);

        String sonuc = "";

        System.out.println("Kelimeler girin (Çıkmak için 0 girin):");

        while (true) {
            String girdi = scanner.nextLine();

            if (girdi.equals("0")) {
                break;
            }

            if (sonuc.isEmpty()) {
                sonuc = girdi;
            } else {
                sonuc = sonuc + " " + girdi;
            }
        }

        if (!sonuc.isEmpty()) {
            System.out.println("Birleştirilmiş metin: " + sonuc);
        } else {
            System.out.println("Hiç kelime girilmedi!");
        }
    }
    //===========================================009 sonu
    // Görev 10: String içinde kelime bulma
    // utulities içine konulacak method olarak
    public static void task10() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz: ");
        String sentence = scanner.nextLine();

        System.out.println("Aramak istediğiniz kelimeyi giriniz: ");
        String search = scanner.nextLine();

        boolean found = sentence.contains(search);

        if (found) {
            System.out.println("'" + search + "' kelimesi cümle içinde BULUNDU!");
        } else {
            System.out.println("'" + search + "' kelimesi cümle içinde BULUNAMADI!");
        }
    }
}
//===========================================010 sonu
// odev sonu