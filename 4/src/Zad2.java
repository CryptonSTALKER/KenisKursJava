import java.util.Scanner;

/**
 * Created by Micha� on 2015-04-30.
 * 2.	U�ytkownik wprowadza 3 liczby od 1 do 100. Wydrukuj je w kolejno�ci rosn�cej.
 */
public class Zad2 {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for(int i = 0; i<=100; i++)
        {
            if(a==i)
                System.out.print(a + " ");
            if(b==i)
                System.out.print(b + " ");
            if(c==i)
                System.out.print(c + " ");
        }
        // Czasami lepiej by� sprytnym, inna droga to wydrukowanie wszystkich zale�no�ci, ale tak jest �atwiej i o wiele mniejsza szansa b��du
    }
    // Problem sortowania, r�wnie� bardzo ciekawe informatyczne zagadnienie ;)

}
