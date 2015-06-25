import java.util.Scanner;

/**
 * Created by Micha� on 2015-04-30.
 */
/*
* 1.	Sprawd�, czy wprowadzona przez u�ytkownika liczba jest pierwsza (0 i 1 nie s� pierwsze, 2 jest liczb� pierwsz�,
* dalej standardowa definicja). Do sprawdzenia u�yj prostego algorytmu, sprawdzaj�cego czy liczba dzieli si� przez wszystkie
* liczby mniejsze od jej po�owy. Je�li dzieli si� przez kt�r�kolwiek, nie jest pierwsza.*/

public class Zad1 {

    public static void main (String args[]) {
        System.out.println("Wprowadz liczbe, a ja sprawdze, czy jest pierwsza: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // u�ytkownik wproawadza liczb�
        int limit = n/2; // ustalamy limit do kt�rego b�dziemy dzieli�, na po�ow� wprowadzonej liczby, je�li liczba jest nie parzysta, jest to po�owa minus 0.5, o czym ju� m�wi�em, przy t�umaczeniu typu int
        boolean isPrime = true;
        String yes = "Liczba " + n + " jest pierwsza";
        String no = "Liczba " + n + " NIE jest pierwsza";

        if(n==0||n==1||n==4) // dlaczego znajduje si� tutaj liczba 4? Poniewa� je�li spojrzymy na nasz prosty algorytm, to zgodnie z jego logik�, 4 zostanie uznane za liczb� pierwsz�
            isPrime=false;
        else if (n==2||n==3) // dlaczego znajduje si� tutaj liczba 3? Tylko dla porz�dku, po co wrzuca� j� w algorytm, skoro wiemy, �e jest pierwsza?
            isPrime=true;
        else { // algorytm startuje dla liczb wi�kszych ni� 4
            for (int i = 2; i < limit; i++) {
                if (n % i == 0) { // w pierwszym kroku p�tli sprawdzamy, czy dzieli si� przez dwa, to wtedy odpada najwi�cej liczb
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println(yes);
        else
            System.out.println(no);

        /* Problem poszukiwania liczby pierwszej, to z�o�ony informatyczny problem, a nasze rozwi�zanie jest bardzo proste i na
        pewno nie optymalne. Zach�cam do zapoznania si� z innymi metodami pozyskiwania liczby pierwszej
        * */

    }
}
