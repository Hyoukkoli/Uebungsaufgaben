class Aufgabe423{
    public static void main(String[] avrg){
        int number = 1;
        int n = 68;
        int end = n;
        while (number <= end){
            if(number % 3 == 0){
                System.out.println(number+"*");
                number = number + 1;
            } else {
                System.out.println(number);
                number = number + 1;
            }
        }
    }
}