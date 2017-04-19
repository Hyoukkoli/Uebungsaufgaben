class Aufgabe64b{

    static int summe(int eingabe){
        if (eingabe > 0){
            int x = eingabe + summe(eingabe - 1);
            return x;
        }
        return eingabe;
    }

    public static void main(String[] args){
        int eingabe = 6;
        int summe = summe(eingabe);
        System.out.println(summe);
    }

}