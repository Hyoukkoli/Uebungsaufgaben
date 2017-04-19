package Aufgabe416;


class Addition {
    public static void main(String[] arvg){
        int sum = 0;
        int counter = 1;
        while (counter <= 10){
            sum = sum + counter;
            counter = counter + 1;
        }
        System.out.println("Value of sum: " +sum);
    }
}