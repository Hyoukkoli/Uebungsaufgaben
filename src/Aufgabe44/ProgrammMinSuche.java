package Aufgabe44;

class ProgrammMinSuche{
    public static void main(String[] args){
        int[] a = {11,7,8,3,15,13,9,19,18,10,4};  
        int merker = a[0];  // damit hat merker den Wert 11
        int i = 1;
        int n = a.length;  // Laenge der Folge a
        while (i < n){
            if (a[i]<merker)
                merker = a[i];
            i = i+1;
        }
        System.out.println(merker);  // druckt das Ergebnis
    }
}

