import java.util.Scanner;

/**
 * Created by Micha� on 2015-04-30.
 * 4.	Zadanie po angielsku. Stw�rz system do robienia wizyt�wek. Odpytaj u�ytkownika o imi� (name),
 * nazwisko (surname), numer telefonu (telephone w typie int). Nast�pnie wydrukuj to w �adny spos�b,
 * tzn ramka i mo�e jakie� efekty, wedle woli i ch�ci.
 */
public class Zad4 {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        int telephone = scanner.nextInt();

        System.out.println("*______________________________*");
        System.out.println("| NAME          " + name );
        System.out.println("| SURNAME       " + surname );
        System.out.println("| TELEPHONE     " + telephone );
        System.out.println("*______________________________*");
    }

}
