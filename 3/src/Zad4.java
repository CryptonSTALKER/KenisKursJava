/**
 * Created by Micha� on 2015-04-28.
 */
public class Zad4 {

    public static void main (String args[])
    {
        char letter = 'a';
        letter--; // potrzebne, nast�pna p�tla najpierw zwi�ksza warto��, potem drukuje, czyli zacz�a by drukowanie od b
        while (letter!='z')
        {
            letter++;
            System.out.println(letter);
        }
        // mo�na oczywi�cie rozwi�za� p�tl� for, ale tak jest zgrabniej ;)
    }

}
