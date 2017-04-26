class Aufgabe713{

    public static void main(String[] args){
        float [] vectorValues = {0.8f, 1.2f, 0.1f, 40.0f};
        Aufgabe711 testvector = new Aufgabe711(vectorValues);


        System.out.println("Der kleinste Wert betraegt " +testvector.vectorComponents[testvector.giveMinimum()]+ " und ist im Index " +testvector.giveMinimum());

        //eigentlicher Weg mit den Methoden
        System.out.println("Der kleinste Wert betraegt " +testvector.giveValue(testvector.giveMinimum())+ " und ist im Index " +testvector.giveMinimum());
    }

}