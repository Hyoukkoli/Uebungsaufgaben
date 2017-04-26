class Aufgabe422{
    public static void main(String[] argv){
        int base= 0;
        int number = 3;
        System.out.println("base\tbase^2\tbase^3");
        System.out.println("++++++++++++++++++++");
        System.out.println("1\t1\t1");
        System.out.println("2\t4\t8");
        System.out.println("3\t9\t27");
        System.out.println();
        System.out.println("base\tbase^2\tbase^3");
        System.out.println("++++++++++++++++++++");
        while (base <= number){
            System.out.println(base+"\t"+base*base+"\t"+base*base*base);
            base = base + 1;
        }
    }
        }

