class Aufgabe712{

    static Aufgabe72 suche(Aufgabe72[] studentArray, int m){
        int index = 0;
        int arrayLength = studentArray.length;
        while ((index < arrayLength) && (studentArray[index].gibtMatrikelnummer() != m)){
            index = index + 1;
        }
        if (index < arrayLength){
            return studentArray[index];
        } else {
            return null;
        }
    }

    //sucht nach matrikelnummern, die kleiner oder gleich der Eingabe sind
    //gib Namen der Studenten, auf die das zutrifft, aus
    static void druckeNamen(Aufgabe72[]studentArray, int matrikel){
        for (int i = 0; i < studentArray.length; i ++){
            if (matrikel >= studentArray[i].gibtMatrikelnummer()){
                System.out.println(studentArray[i].gibStudname());
            }
        }
    }


    public static void main(String[] args){

        Aufgabe72[] studentArray = new Aufgabe72[3];
        studentArray[0] = new Aufgabe72("Thorsten Meier", 88188, 1980);
        studentArray[1] = new Aufgabe72("Monika Schmidt", 88633, 1981);
        studentArray[2] = new Aufgabe72("Monika Schneider", 88755, 1980);
        int matrikel = 88633;
        boolean gefunden = (suche(studentArray, matrikel) != null);
        if (gefunden){
            System.out.println(matrikel + " gefunden");
        } else {
            System.out.println(matrikel + " nicht gefunden");
        }
        System.out.println("Studenten mit der Matrikelnummer " +matrikel+ " oder kleiner sind: ");
        druckeNamen(studentArray, matrikel);

    }
}