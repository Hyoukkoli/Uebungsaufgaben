class Aufgabe77{

    boolean roteLampe;
    boolean grueneLampe;

    Aufgabe77(){
        roteLampe = false;
        grueneLampe = false;
    }

    void schalteRot(boolean wert){
        roteLampe = wert;
    }
    void schalteGruen(boolean wert){
        grueneLampe = wert;
    }

    void druckeZustand(){
        String statusRote;
        String statusGruene;

        if(roteLampe == true){
            statusRote = "an";
        }else {
            statusRote = "aus";
        }

        if (grueneLampe == true){
            statusGruene = "an";
        }else{
            statusGruene = "aus";
        }

        System.out.println("Die rote Lampe ist " +statusRote);
        System.out.println("Die gruene Lampe ist " +statusGruene);
    }


}