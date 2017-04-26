class Aufgabe76{

    String studname;
    int matrikelnummer;
    int geburtsjahr;

    int ueberpruefeJahr(){
        if (geburtsjahr > 1950){
            geburtsjahr = 0;
            return geburtsjahr;
        }
        else{
            return geburtsjahr;
        }
    }


    Aufgabe76(String name, int nummer, int jahr){
        studname = name;
        matrikelnummer = nummer;
        geburtsjahr = ueberpruefeJahr();
    }


}