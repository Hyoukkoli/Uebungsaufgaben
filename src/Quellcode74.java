class Quellcode74{
    Aufgabe72 wert; //Klasse Studierende
    Quellcode74 naechstes;

    void setzteWert(Aufgabe72 einwert){
        wert = einwert;
    }

    Aufgabe72 gibWert(){
        return wert;
    }

    Quellcode74 gibNaechstes(){
        return naechstes;
    }

    void setzteNaechstes (Quellcode74 einnaechstes){
        naechstes = einnaechstes;
    }
}