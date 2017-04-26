class SuchProgramm{

    static Aufgabe72 suche (Aufgabe72[] d, int m) {
        int i = 0;
        int n = d.length;
        while ((i < n) && (d[i].gibtMatrikelnummer() != m)){
            i = i + 1;}
        if ( i < n){
            return d[i];
        }else
            return null;
        }

        public static  void main(String[] args){

            Aufgabe72[] testd = new Aufgabe72[3];
            testd[0] = new Aufgabe72("Thorsten Maier", 88188, 1980);
            testd[1] = new Aufgabe72("Monika Schmidt", 88633, 1981);
            testd[2] = new Aufgabe72("Monika Schneider", 88755, 1980);
            int m = 88633;
            boolean gefunden = (suche(testd, m) != null);
            if (gefunden){
                System.out.println(m + " gefunden");}
            else {
                System.out.println(m + " nicht gefunden");
            }
    }
}
