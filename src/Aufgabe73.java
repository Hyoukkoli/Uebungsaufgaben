class Aufgabe73{

    boolean roteLampe;
    boolean grueneLampe;

    Aufgabe73(boolean rot, boolean gruen){
        roteLampe = rot;
        grueneLampe = gruen;
    }

    void setzteRoteLampe(boolean rot){
        roteLampe = rot;
    }

    boolean ueberpruefeRoteLampe(){
        return roteLampe;
    }

    void setzteGrueneLampe(boolean gruen){
        grueneLampe = gruen;
    }

    boolean ueberpruefeGrueneLampe(){
        return grueneLampe;
    }

}