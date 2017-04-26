/**
 * Created by Andrea on 11.04.2017.
 */
public class Aufgabe417 {
    public static void main (String[] argv){
        int summe = 0;
        int zaehler = 1;
        int counter = 0;
        while (zaehler < 4){
            summe = summe + zaehler;
            zaehler = zaehler + 1;
            counter = counter + 1;
        }
        int mittelwert = summe/counter;
        System.out.println ("Value of summe: " +summe);
        System.out.println ("Value of zaehler: " +zaehler);
        System.out.println ("Value of mittelwert: " +mittelwert);
    }
}
