import java.util.Scanner;

/**
 * Created by Micha� on 2015-04-30.
 * 3.	Stw�rz system do obliczania punkt�w. U�ytkownik wprowadza po kolei 3 ilo�ci, punkty za styl,
 * punkty za efekty i punkty ze rezultat. Punkty za styl pomn� przez 0.2, punkty za efekty przez 0.3,
 * a punkty za rezultat przez 0.5 i wydrukuj sum� tych dzia�a�.3.	Stw�rz system do obliczania punkt�w.
 * U�ytkownik wprowadza po kolei 3 ilo�ci, punkty za styl, punkty za efekty i punkty ze rezultat. Punkty
 * za styl pomn� przez 0.2, punkty za efekty przez 0.3, a punkty za rezultat przez 0.5 i wydrukuj sum� tych dzia�a�.
 */
public class Zad3 {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        double styl = scanner.nextDouble() * 0.2;
        double efekty = scanner.nextDouble() * 0.3;
        double rezultat = scanner.nextDouble() * 0.5;
        double suma = styl+efekty+rezultat;
        System.out.println(suma);
    }

}
