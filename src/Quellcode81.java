class Quellcode81{

    Aufgabe72 [] datenbasis;

    Quellcode81 (int n){
        datenbasis = new Aufgabe72[n];
    }

    Aufgabe72 searchMatrikel(int matrikel){
        int index = 0;
        int length = datenbasis.length;
        while (index < length){
            if (datenbasis[index] != null && datenbasis[index].gibtMatrikelnummer() == matrikel){
                return datenbasis[index];
            }
            index = index + 1;
        }
        return null;
    }

    boolean addStudent(Aufgabe72 oneStudent){
        int index = 0;
        int length = datenbasis.length;
        while (index < length){
            if(datenbasis[index] == null){
                datenbasis[index] = oneStudent;
                return true;
            }
            index = index + 1;
        }
        return false;
    }
}