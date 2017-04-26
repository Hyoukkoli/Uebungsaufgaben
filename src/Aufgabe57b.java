class Aufgabe57b{

    static double qFunktion(double x){
        double y = 4 * x * x + 5 * x - 3;
        return y;}


    public static void main(String[] args){


        double xValue = 1.0;
        double xEnd = 1.4;
        double step = 0.1;
        System.out.println("xValue\tyValue");
        System.out.println("xxxxxxxxxxxxxx");
        while (xValue <= xEnd){
            double yValue = qFunktion(xValue);
            System.out.println(xValue +"\t" +yValue +"\t");
            xValue = xValue + step;
        }
    }


    }