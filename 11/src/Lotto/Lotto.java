package Lotto;

import java.math.BigInteger;

/**
 * Created by Micha� on 2015-06-25.
 * Z racji, �e to ju� ostanie, dzisiaj r�wnie� b�dzie jedno zadanie. B�dzie wymaga�o poszukania dodatkowych
 * informacji, o kt�rych nie m�wi�em podczas kursu, ale taka rola programisty, ca�y czas si� rozwija i szuka
 * rozwi�za�, do dzie�a!

 Napisz program obliczaj�cy szans� na wygranie w lotto. Wz�r wygl�da tak:

 k!
 ---------
 k!(n-k)!

 czyli

 49!
 ---------
 6!(49-6)!


 Powodzenia!
 */
public class Lotto {

    public static BigInteger factorial(int a)
    {
        BigInteger s = new BigInteger("1");
        for(int i=1; i<=a; i++)
        {
            s = s.multiply(BigInteger.valueOf(i));
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 49;
        int k = 6;
        BigInteger result = factorial(n).divide(factorial(k).multiply(factorial(n-k)));
        System.out.println("Probably to Lotto win is like 1 to "+result);

    }
}
