class Quellcode82{

    public static void main(String[] args){
        Quellcode81 informatikDB = new Quellcode81(500);
        Quellcode81 mathematikDB = new Quellcode81(300);
        Quellcode81 medizinDB = new Quellcode81(100);

        informatikDB.addStudent(new Aufgabe72("Monika Schmidt", 88633, 1981));

        int matrikel = 88633;
        boolean numberFound = (informatikDB.searchMatrikel(matrikel) != null || mathematikDB.searchMatrikel(matrikel) != null | medizinDB.searchMatrikel(matrikel) != null);
            if (numberFound) System.out.println(matrikel+ " gefunden");
            else System.out.println(matrikel+ " nicht gefunden");
    }
}