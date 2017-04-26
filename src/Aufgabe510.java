import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Aufgabe510{

    static ArrayList folgeSortieren(int []restfolge){

        List<Integer> intList = new ArrayList<Integer>();
        for(int index = 0; index < restfolge.length; index++){
            intList.add(restfolge[index]);
        }

        ArrayList<Integer> ergebnisfolge = new ArrayList<Integer>();
        int laenge = intList.size();
        int kleinsterWert = intList.get(0);
        int oldKleinsterWert = kleinsterWert;
        int position = 0;
        int newCounter = 0;

        while (newCounter != laenge){
            for (int counter = 1; counter < laenge; counter++) {
                if (kleinsterWert > intList.get(counter)) {
                    kleinsterWert = intList.get(counter);
                    position = intList.indexOf(kleinsterWert);
                }
            }

            ergebnisfolge.add(kleinsterWert);
            oldKleinsterWert = kleinsterWert;
            intList.remove(position);

            if(intList.isEmpty()){
                return ergebnisfolge;
            }

            kleinsterWert = intList.get(0);
            laenge = intList.size();
            position = intList.indexOf(kleinsterWert);
            }

        return ergebnisfolge;
    }


    public static void main(String[] args){
        int []restfolge = {11,7,8,3,15,13,9,19,18,10,4};
        ArrayList<Integer> ergebnisfolge = new ArrayList<Integer>();
        ergebnisfolge = folgeSortieren(restfolge);
        System.out.println(ergebnisfolge);
    }
}