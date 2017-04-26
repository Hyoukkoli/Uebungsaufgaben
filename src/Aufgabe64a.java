class Aufgabe64a{
    static int summeBerechnen(int eingabe){
        int number = 1;
        int sum = 0;
        while (number <= eingabe){
            sum = sum + number;
            number = number + 1;
        }
        return sum;
    }

    public static void main(String[] args){
        int eingabe = 10;
        System.out.println(summeBerechnen(eingabe));
    }

}