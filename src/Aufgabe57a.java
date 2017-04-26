class Aufgabe57a{
    static int hochZwei(int n){
        n = n * n;
        return n;
    }

    static int hochDrei(int n){
        n = n * n * n;
        return n;
    }

    public static void main(String[] argv){
        int base= 0;
        int number = 3;
        System.out.println("base"+"\t"+hochZwei(base)+"\t"+hochDrei(base));
        System.out.println("++++++++++++++++++++");
        while (base <= number){
            System.out.println(base+"\t"+hochZwei(base)+"\t"+hochDrei(base));
            base = base + 1;
        }
    }
}