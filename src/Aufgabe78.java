class Aufgabe78{

    public static void main(String[] args){
        Aufgabe77 eineAmpel = new Aufgabe77();
        eineAmpel.roteLampe = true;
        eineAmpel.grueneLampe = false;

        boolean hilfsRot = eineAmpel.roteLampe;
        boolean hilfsGruen = eineAmpel.grueneLampe;

        for (int i = 1; i < 20; i++){
            if ( i % 2 != 0){
                eineAmpel.roteLampe = hilfsRot;
                eineAmpel.grueneLampe = hilfsGruen;
            } else{
                eineAmpel.roteLampe = hilfsGruen;
                eineAmpel.grueneLampe = hilfsRot;
            }
            System.out.println("Durchlauf "+i+":");
            eineAmpel.druckeZustand();
            System.out.println("####################################");
        }
    }
}