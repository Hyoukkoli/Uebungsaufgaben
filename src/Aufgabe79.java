class Aufgabe79{

    int [] a;

    Aufgabe79(int n){
        int [] a = new int [n];
    }


    void invers(){
        int [] helpArray = a;
        int indexHelp = helpArray.length;
        for (int i = 0; i < a.length; i++){
            if(indexHelp > 0) {
                a[i] = helpArray[indexHelp];
                indexHelp = indexHelp - 1;
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

}