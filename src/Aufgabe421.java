class Aufgabe421{
    public static void main(String[] argv){
        String l = argv[0];
        String b = argv[1];
        double laenge = Double.parseDouble(l);
        double breite = Double.parseDouble(b);
        double flaeche = laenge * breite;
        System.out.println("Size of rectangle: "+flaeche);
    }
}