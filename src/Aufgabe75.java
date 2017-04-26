class Aufgabe75{

    String schrankFarbe;
    double schrankHoehe;
    double schrankBreite;
    int anzahlTueren;
    boolean tuereOffen;
    boolean beleuchtungSchrank;
    boolean hatSpiegel;
    boolean hatInhalt;

    // --- Infos ueber Hoehe
    void setzteHoehe(int hoehe){
        schrankHoehe = hoehe;
    }
    double ermittleHoehe(){
        return schrankHoehe;
    }

    // --- Infos ueber Breite
    void setzteBreite(int breite){
        schrankBreite = breite;
    }
    double ermittleBreite(){
        return schrankBreite;
    }

    // --- Infos ueber Tueren
    void setzteTuere(int tuere){
        anzahlTueren = tuere;
    }
    double ermittleAnzahlTuere(){
        return anzahlTueren;
    }

    // --- Infos ueber Status der Tueren
    void setzteStatusTuere(boolean offen){
        tuereOffen = offen;
    }
    boolean ermittleStatusTuere(){
        return tuereOffen;
    }

    // --- Infors ueber Beleuchtung
    void setzteLicht(boolean licht){
        beleuchtungSchrank = licht;
    }
    boolean ermittleBeleuchtung(){
        return beleuchtungSchrank;
    }

    // --- Infos ueber Spiegel
    void setzteSpiegel (boolean spiegel){
        hatSpiegel = spiegel;
    }
    boolean ermittleSpiegel(){
        return hatSpiegel;
    }

    // --- Infos ueber Inhalt
    void setzteInhalt(boolean inhalt){
        hatInhalt = inhalt;
    }
    boolean ermittleInhalt(){
        return hatInhalt;
    }

}