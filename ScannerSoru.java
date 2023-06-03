package w3resourcecomsorularivecozumleri;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerSoru {
    public static void main(String[] args) {
        /*Girdi olarak iki sayı alan ve iki sayının çarpımını gösteren bir Java programı yazınız.
        Test Verileri:
        İlk sayı girin: 25
        İkinci sayı girin: 5
        Beklenen Çıkış :
        25 x 5 = 125*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int crpm=a*b;
        System.out.println(a +"*" +b + "=" +crpm);

        /*İki sayının toplamını (toplamayı), çarpmasını, çıkarmasını, bölmesini ve kalanını yazdıran bir Java programı yazınız.
                Test Verileri:
        Birinci giriş numarası: 125
        İkinci giriş numarası: 24
        Beklenen Çıkış :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5 */
        System.out.println("iki sayı giriniz");

        int c=scan.nextInt();
        int d=scan.nextInt();
        System.out.println("iki sayı ile işlem yapınız (+ için (1) ,- için (2) ,* için (3) ,/ için (4) ,% için (5)");
        int opr= scan.nextInt();

        if (opr==1){
            System.out.println(c+"+"+d +"="+(c+d));
        } else if (opr==2) {
            System.out.println(c+"-"+d +"="+ (c-d));

        } else if (opr==3) {
            System.out.println(c+"*"+d +"="+(c*d));
        } else if (opr==4) {
            System.out.println(c+"/"+d +"="+(c/d));
        } else if (opr==5) {
            System.out.println(c+"%"+d +"="+(c%d));
        }else {
            System.out.println("tanımlı bir işlem giriniz");
        }


    }
}
