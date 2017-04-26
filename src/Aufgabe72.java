class Aufgabe72{

    String studname;
    int matrikelnummer;
    int geburtsjahr;


    Aufgabe72(String name, int nummer, int jahr){
        studname = name;
        matrikelnummer = nummer;
        geburtsjahr = jahr;

    }


    String gibStudname(){
        return studname;
    }
    void setzteStudname(String name){
        studname = name;
    }

    int gibtMatrikelnummer(){
        return matrikelnummer;
    }
    void setzteMatrikelnummer(int nummer){
        matrikelnummer = nummer;
    }

    int gibGeburtsjahr(){
        return geburtsjahr;
    }
    void setzteGeburtsjahr(int jahr){
        geburtsjahr = jahr;
    }
    int gibAlter(){
        int aktJahr = 2017;
        return aktJahr - geburtsjahr;

    }


}