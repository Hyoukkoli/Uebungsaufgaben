/**
 * Created by Andrea on 11.04.2017.
 */
public class Aufgabe416 {
    public static void main (String[] argv){
        int sum = 1;
        int addition = sum+ 1;
        while (addition <= 10){
            sum = sum + addition;
            addition = addition + 1;
        }
        System.out.println("Final sum: " +sum);

    }
}
