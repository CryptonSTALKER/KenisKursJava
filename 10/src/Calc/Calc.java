package Calc;

import java.util.Scanner;

/**
 * Created by Micha� on 2015-06-24.
 * Z racji, �e to ju� praktycznie koniec, pora na jedno du�e zadanie z kilku podpunkt�w:
 * Napisz kalkulator do interpretuj�cy wpisany tekst, tzn u�ytkownik wpisuje liczby naturalne od -999 do 999,
 * nast�pnie znak mno�enie, dzielenie, dodawanie lub odejmowanie i znowu cyfry -999 do 999. Program
 * drukuje wynik, a u�ytkownik wpisuje nast�pne dzia�anie. Zabezpiecz si� przed najwi�ksz� mo�liw� ilo�ci�
 * b��d�w u�ytkownika. Tekst END ko�czy wpisywanie danych.
 * a)	Pami�taj poinformowa� u�ytkownika co w�a�ciwie ma robi� odpowiednimi komendami
 * b)	Napisz metod� sprawdzaj�c�, czy u�ytkownik wprowadzi� tekst, czy liczb�, czy mo�e liczb� ujemn�,
 * dobrze przemy�l t� metod�, u�ytkownik mo�e wprowadzi� 800, 7 i -60 i wszystko to s� prawid�owe liczby
 * c)	Staraj si� da� jak najwi�cej informacji zwrotnej, np. w tek�cie znajduje si� spacja, spr�buj znowu usuwaj�c j�
 * d)	Staraj si� zwraca� typ int, chyba, �e mamy u�amek, wtedy double.
 * e)	Wszystko �adnie sformatuj, niech aplikacja wygl�da porz�dnie.
 */
public class Calc {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calc calc = new Calc();
        Check check = new Check();
        String str = "", oper, checkResult;
        int number1, number2;
        System.out.println("Enter the operation.");
        System.out.println("Example: 36+72, don't use space, use number from -999 to 999 and +, -, * or /");
        System.out.println("Word END endings program");
        System.out.println("Enter the operation:");
        while (!str.equals("end")) {
            str = calc.read().toLowerCase();
            if (!str.equals("end")) {
                checkResult = check.checkConditions(str);
                if (!checkResult.equals("OK")) {
                    System.out.println(checkResult);
                    System.out.println("Enter the operation:");
                } else {
                    oper = check.checkOperation(str);
                    number1 = check.check1Number(str, oper);
                    number2 = check.check2Number(str, oper);
                    if (number1 > 999 || number1 < -999 || number2 > 999 || number2 < -999)
                        System.out.println("I do not recognize digits");
                    else
                        System.out.println("= " + calc.calculate(number1, number2, oper));
                    System.out.println("Enter the operation:");
                }
            }
        }

    }

    private String calculate(int n1, int n2, String oper) {
        if (oper.equals("+"))
            return (n1 + n2) + "";
        else if (oper.equals("-"))
            return (n1 - n2) + "";
        else if (oper.equals("*"))
            return (n1 * n2) + "";
        else {
            double result = (double)n1/(double)n2;
            return result+"";
        }
    }

    private String read() {
        return scanner.next();
    }
}
