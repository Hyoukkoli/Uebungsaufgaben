class Aufgabe74{

    String farbeSitzflaeche;
    double hoehe;
    boolean armlehnen;

    Aufgabe74(String farbe, double hoeheStuhl, boolean anzahlArmlehnen){
        farbeSitzflaeche = farbe;
        hoehe = hoeheStuhl;
        armlehnen = anzahlArmlehnen;
    }

    boolean hatArmlehnen(){
        return armlehnen;
    }


}