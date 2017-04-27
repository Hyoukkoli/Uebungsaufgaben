class SuchProgramm7{

    static Aufgabe72 suche (Aufgabe72[] d, int m) {
        int i = 0;
        int n = d.length;
        while ((i < n) && (d[i].gibtMatrikelnummer() != m)){
            i = i + 1;}
        if ( i < n){
            return d[i];
        }else
            return null;
    }

    public static  void main(String[] args){

        //step 1
        Quellcode74 dliste = new Quellcode74();

        //step 2
        Aufgabe72 a;
        a = new Aufgabe72("Thorsten Meier", 88188, 1980);

        //step 3
        dliste.setzteWert(a);

        //step 4
        Quellcode74 aktuell = dliste;

        //step 5
        dliste.setzteNaechstes(new Quellcode74());
        aktuell = aktuell.gibNaechstes();

        //step 6
        a = new Aufgabe72("Monika Schmidt", 88633, 1981);
        aktuell.setzteWert(a);
        
        //step 7
        aktuell.setzteNaechstes(new Quellcode74());
        a = new Aufgabe72("Monika Schneider", 88755, 1980);
        aktuell = aktuell.gibNaechstes();
        aktuell.setzteWert(a);
    }
}
