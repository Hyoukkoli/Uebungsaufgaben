class Programm{

    // hier koennen noch Variablen und Funktionen deklariert werden

  public static void main(String[] args) {

    int eingabe = 10;
    int summe = 1;

    int addiert = summe + 1;

    while (addiert <= eingabe) {
      summe = summe + addiert;
      addiert = addiert + 1;
    }

    System.out.println(summe);
  }
}
