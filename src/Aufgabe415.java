class Aufgabe_415 {
    public static void main(String[] argv) {
        int wert = 8;
        int a = 1;
        int counter = 1;
        while (counter <= 5){
            if (wert % a == 2){
                wert = wert + a;
            } else {
                a = a + 3;
            }
            counter = counter + 1;
        }
        System.out.println(" value of counter: " +counter);

    }
}