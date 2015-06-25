/**
 * Created by Micha� on 2015-06-17.
 */

// W tym przypadku produkt sam zna sw�j numer ID. Implemntacja w kt�rej fabryka
// go przydziela wcale nie jest trudna i czasem zdarzaj� si� takie sytuacje
// wszystko zale�y od konkretnego zadania
public class Zad2_Factory {

    public static void main(String args[])
    {
        Zad2_Factory factory = new Zad2_Factory();
        Zad2_Product[] myProducts = new Zad2_Product[100];
        factory.create100Product(myProducts);

        myProducts[5].start();
        myProducts[45].start();
        myProducts[82].start();
        myProducts[0].start();
        myProducts[99].start();
        myProducts[1].start();
    }

    private void create100Product(Zad2_Product[] myProducts)
    {
        for(int i=0; i<100; i++)
        {
            myProducts[i] = new Zad2_Product();
        }
    }
}
