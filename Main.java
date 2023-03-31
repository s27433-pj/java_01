import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //zadnie_01();
        //zadanie_02();
        //zadanie_03();
        //zadanie_04();
        //zadanie_05();
        //zadanie_06();
        //zadanie_07();
        //zadanie_08();
        zadanie_09();
    }

    public static void zadnie_01() {
        class uczen {
            String name;
            String nazwisko;
            byte grupa;
            String kierunek;
        }

        uczen uczen0 = new uczen();
        uczen0.name = "Pawel";
        uczen0.nazwisko = "Szymański";
        uczen0.grupa = 12;
        uczen0.kierunek = "informatyka";

        System.out.println("Imie: " + uczen0.name);
        System.out.println("Nazwisko: " + uczen0.nazwisko);
        System.out.println("Grupa: " + uczen0.grupa);
        System.out.println("Kierunek: " + uczen0.kierunek);
    }

    public static void zadanie_02() {
        Scanner scan = new Scanner(System.in);
        class uczen {
            String imie;
            String imie2;
            String nazwisko;
            String grupa;
            String kierunek;
        }
        uczen uczen0 = new uczen();

        uczen0.imie = scan.next();
        uczen0.imie2 = scan.next();
        uczen0.grupa = scan.next();
        uczen0.kierunek = scan.next();

        System.out.println("Imie: " + uczen0.imie);
        System.out.println("Nazwisko: " + uczen0.imie2);
        System.out.println("Grupa: " + uczen0.grupa);
        System.out.println("Kierunek: " + uczen0.kierunek);
    }

    public static void zadanie_03() {
        class zmienne {
            byte b = 0;
            short s;
            int i;
            long l;
            float f;
            double d;
            char c;
            String str;
            boolean bool;

            public zmienne() {

                s = 0;
                i = 0;
                l = 0;
                f = 0.0F;
                d = 0.0d;
                c = '\u0000';
                str = null;
                bool = false;
            }
        }
        zmienne obj = new zmienne();
        System.out.println("byte: " + obj.b);
        System.out.println("short: " + obj.s);
        System.out.println("int: " + obj.i);
        System.out.println("long: " + obj.l);
        System.out.println("float: " + obj.f);
        System.out.println("double: " + obj.d);
        System.out.println("char: " + obj.c);
        System.out.println("String: " + obj.str);
        System.out.println("boolean: " + obj.bool);

    }

    public static void zadanie_04() {
        class str {
            static String txt;
            static String txt1;
        }
        str obj = new str();

        Scanner scan = new Scanner(System.in);
        System.out.print("str1: ");
        str.txt = scan.next();
        System.out.print("str2: ");
        str.txt1 = scan.next();
        System.out.println("str1 " + "==" + " str2:");
        boolean wynik = str.txt.equals(str.txt1);
        System.out.println(wynik);

        System.out.println("str1.equals(str2): " + wynik);
    }

    public static void zadanie_05() {
        int x = 5;
        int y = 10;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("++x = " + ++x);
        System.out.println("y++ = " + y++);
        System.out.println(x);
        System.out.println(y);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        double w = 33.5;
        double z = 17.3;
        double ww = w * z;
        double wz = w / z;

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        DecimalFormat dz = new DecimalFormat("#.#######", symbols);

        String formattedResult = df.format(ww);
        String formattedResult1 = dz.format(wz);
        System.out.println("w + z = " + w + z);
        System.out.println("w - z = " + (w - z));
        System.out.println("w * z = " + formattedResult);
        System.out.println("w / z = " + formattedResult1);
        System.out.println("w % z = " + w % z);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int m = 3;
        int n = 17;
        int o = 10;

        System.out.println("m < n = " + (m < n));
        System.out.println("m > 0 = " + (m > o));
        System.out.println("n <= o = " + (m <= o));
        System.out.println("m >= n = " + (m >= n));
        System.out.println("m < n = " + (m < n));
        System.out.println("n == o = " + (n == o));
        System.out.println("m != o = " + (m != o));

    }

    public static void zadanie_06() {
        Scanner scan = new Scanner(System.in);
        int[][] tab = new int[3][3];
        System.out.println("Elementy tablicy: ");
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length; i++) {
                tab[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int k = 0; k < tab[i].length; k++) {
                System.out.print(tab[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        System.out.println(tab[2][0] + " " + tab[2][1] + " " + tab[2][2]);
        System.out.println(tab[1][0] + " " + tab[1][1] + " " + tab[1][2]);
        System.out.println(tab[0][0] + " " + tab[0][1] + " " + tab[0][2]);
    }

    public static void zadanie_07() {
        class walec {
            int r;
            int h;
        }

        walec walec = new walec();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj promień walca: ");
        walec.r = scan.nextInt();
        System.out.println("Podaj wysokość walca: ");
        walec.h = scan.nextInt();

        double V = Math.PI * walec.r * walec.r * walec.h;
        String formattedV = String.format("%.2f", V);

        System.out.println("Pojemność walca wynosi " + formattedV);
    }

    public static void zadanie_08() {
        String tab[][] = {
                {"P", "    ", "Q", "    ", "AND", "  ", "OR", "   ", "XOR", "   ", "NOT"},
                {"true", " ", "true", " ", "true", " ", "true", " ", "false", " ", "false"},
                {"true", " ", "false", "", "false", "", "true", " ", "true", "  ", "false"},
                {"false", "", "true", " ", "false", "", "true", " ", "true", "  ", "true"},
                {"false", "", "false", "", "false", "", "false", "", "false", " ", "true"},
        };
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zadanie_09() throws IOException {


    class odganiLietere{
        char[] alphabet;
        char[] alphabet1;
        int miejsceZnaku;

        int user;

    }

        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        char[] alphabet1 = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet1[i] = (char) ('a' + i);
        }
        odganiLietere znak1 = new odganiLietere();
        znak1.miejsceZnaku = 0;
        char znak = 'c';
        for (int j = 0; j < 26; j++){
            if(alphabet[j] == znak)
                znak1.miejsceZnaku = j;
        }

        for (int j = 0; j < 26; j++){
            if(alphabet1[j] == znak)
                znak1.miejsceZnaku = j;
        }

        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Odgadni ją: ");
        char user = (char) System.in.read();
        int liczba = 0;
        for (int j = 0; j < 26; j++){
            if(alphabet[j] == user)
                liczba = j;
        }

        for (int j = 0; j < 26; j++){
            if(alphabet1[j] == user)
                liczba = j;
        }

        boolean wynik = znak == user;
        if (znak1.miejsceZnaku == liczba)
            System.out.println("Dobrze!");
        else if (znak1.miejsceZnaku > liczba)
            System.out.println("Trafiłeś zbyt nisko");
        else if (znak1.miejsceZnaku < liczba)
            System.out.println("Trafiłeś zbyt wysoko");

    }
}