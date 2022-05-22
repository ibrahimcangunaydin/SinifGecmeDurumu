import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, total=0, sayac = 0;
        double ortalama;


        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        if (mat > 0 && mat < 100) {
            sayac++;
            total += mat;
        }

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        if (fizik > 0 && fizik < 100) {
            sayac++;
            total += fizik;
        }

        System.out.print("Turkce notunuz: ");
        turkce = inp.nextInt();
        if (turkce > 0 && turkce < 100) {
            sayac++;
            total += turkce;
        }

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        if (kimya > 0 && kimya < 100) {
            sayac++;
            total += kimya;
        }

        System.out.print("Muzik notunuz: ");
        muzik = inp.nextInt();
        if (muzik > 0 && muzik < 100) {
            sayac++;
            total += muzik;
        }


        if (sayac == 0) {
            sayac = 1; // 0'a bölünme durumunu engellemek için eklendi
        }


        ortalama = total / sayac;

        System.out.println("Ortalamaniz: " + ortalama);

        if (ortalama < 55) {
            System.out.print("Sinifta kaldiniz, seneye gorusmek uzere!");
        } else {
            System.out.print("Tebrikler, sinifi gectiniz!");
        }

    }
}
