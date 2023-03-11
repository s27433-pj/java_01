import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //zadanie_01();
        //zadanie_02();
        //zadanie_03();
        //zadanie_04();
        //zadanie_05();
        //zadanie_06();
        //zadanie_07();
        //zadanie_08();
        //zadanie_09();
        //zadanie_10();
        //zadanie_13();
    }
    public static void zadanie_01(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj Bok a i b");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = a * b;
        System.out.println(result);

    }
    public static void zadanie_02(){
        var pi = 3.141592;
        double result = Math.sqrt(pi);
        var decimalF = new DecimalFormat("#.##");
        var formattedText = decimalF.format(result);
        System.out.println(formattedText);

    }

    public static void zadanie_03(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj napis1 i napis2");
        String napis1 = scan.nextLine();
        String napis2 = scan.nextLine();

        System.out.println(napis1 + " " + napis2);

    }

    public static void zadanie_04(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj boki a,b,c");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a <= 0 || b <= 0 || c <= 0 ) {
            System.out.println("BLAD");
        }else if ((a+b>c && a+c>b && b+c>a )) {
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }
    public static void zadanie_05() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbe z zakresu 0-11");
            int months = scan.nextInt();
            switch (months) {
                case 0:
                    System.out.println("Styczen 31");
                    break;
                case 1:
                    System.out.println("Luty 28 lub 29 w roku przestępnym");
                    break;
                case 2:
                    System.out.println("Marzec 31");
                    break;
                case 3:
                    System.out.println("Kwiecien 30");
                    break;
                case 4:
                    System.out.println("Maj 31");
                    break;
                case 5:
                    System.out.println("Czerwiec 30");
                    break;
                case 6:
                    System.out.println("Lipec 31");
                    break;
                case 7:
                    System.out.println("Sierpien 31");
                    break;
                case 8:
                    System.out.println("Wrzesien 30");
                    break;
                case 9:
                    System.out.println("Pazdziernik 31");
                    break;
                case 10:
                    System.out.println("Listopad 30");
                    break;
                case 11:
                    System.out.println("Grudzien 31");
                    break;
                default:
                    System.out.println("BŁĄD");

            }
        } catch (Exception e) {System.out.println("BŁĄD");}

    }
    public static void zadanie_06(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 3 Cyfry");
        float liczba1 = scan.nextInt();
        float liczba2 = scan.nextInt();
        float liczba3 = scan.nextInt();

        if( liczba1 > liczba2 && liczba2 > liczba3){
            System.out.println(liczba3 +" "+ liczba2+" "+liczba1);
        } else if (liczba2 > liczba1 && liczba1 > liczba3) {
            System.out.println(liczba3 +" "+ liczba1+" "+liczba2);

        } else if (liczba3 > liczba1 && liczba1 > liczba2) {
            System.out.println(liczba2 +" "+ liczba1+" "+liczba3);

        }else if (liczba3 > liczba2 && liczba2 > liczba1){
            System.out.println(liczba1 +" "+ liczba2+" "+liczba3);
        }else if (liczba1 > liczba3 && liczba3 > liczba2){
            System.out.println(liczba2 +" "+ liczba3+" "+liczba1);
        }
    }

    public static void zadanie_07() {

        int
                totalWynik = 0;

        Scanner scan = new Scanner(System.in);


        System.out.println("Podaj liczbe n:");
        int n = scan.nextInt();

        System.out.println("Podaj liczbe m:");
        int m = scan.nextInt();

        if (n != m) {
            System.out.println("BŁĄD");
            return;
        }

        int[] tab = new int[n];
        for (int i : tab) {
            tab[i] = scan.nextInt();
            System.out.println(tab[i] + " : jest elementem N tab");
        }

        int[] tab1 = new int[m];
        for (int j : tab1) {
            tab1[j] = scan.nextInt();
            System.out.println(tab1[j] + " :  jest elementem M tab");
        }

        for (int i = 0; i < n; i++) {
            totalWynik += tab[i] * tab1[i];

        }

        System.out.println("Iloczyn skalarany: " + (totalWynik + totalWynik));
    }

    public static void zadanie_08() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
            for (int ileSpc = num - i; ileSpc > 0; ileSpc--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= num; i++) {
            for (int ileSpc = num - i; ileSpc > 0; ileSpc--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void zadanie_09() {

        String pierwotna = "kajak";
        pierwotna = pierwotna.replace(" ", "");
        String odwrocona = "";
        for (int i = pierwotna.length() - 1; i >= 0; i--) {
            odwrocona += pierwotna.charAt(i);

        }
        boolean palindrome = true;
        for (int i = 0; i < pierwotna.length(); i++) {
            if (pierwotna.charAt(i) != odwrocona.charAt(i))
                palindrome = false;
            else
                palindrome = true;
        }

        if (palindrome)
            System.out.println("TAK");
        else
            System.out.println("NIE");

    }

    public static void zadanie_10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilosc wierszy: ");
        int a = scan.nextInt();
        System.out.println("Podaj ilosc kolumn: ");
        int b = scan.nextInt();
        int[][] tab = new int[a][b];
        int iloscElementow = 0;
        System.out.println("Elementy 1 kolumny tablicy: ");
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                tab[i][j] = scan.nextInt();
            }
            iloscElementow++;
            if (iloscElementow != b)
                System.out.println("Podaj Elementy nastepnej kolumny tablicy:");
// wyświetlanie wierszy
            for (int i = 0; i < tab.length; i++) {
                for (int k = 0; k < tab[i].length; k++) {
                    System.out.print(tab[i][k] + " ");
                }
                System.out.println();
            }
        }
// wyświetlanie kolumn
        System.out.println("Transpozycja: ");
        for (int k = 0; k < tab[0].length; k++) {
            for (int i = 0; i < tab.length; i++) {
                System.out.print(tab[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void zadanie_13() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++)
            tab[i] = scanner.nextInt();

        int najwiekszy = najElement(tab, n);
        System.out.println("Największy element: " + najwiekszy);
    }

    public static int najElement(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        } else {
            int max = najElement(tab, n - 1);
            if (tab[n - 1] > max) {
                return tab[n - 1];
            } else {
                return max;
            }
        }
    }
}