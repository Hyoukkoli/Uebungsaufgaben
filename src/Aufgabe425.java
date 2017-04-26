class Aufgabe425{
    public static void main(String[] argv){
//        double x = -2;
//        double y = 4*(x*x)+5*x-3;
//       System.out.println(y);

        double xValue = 1.0;
        double xEnd = 1.4;
        double step = 0.1;
        System.out.println("xValue\tyValue");
        System.out.println("xxxxxxxxxxxxxx");
        while (xValue <= xEnd){
            double yValue = 4 * (xValue * xValue) + 5 * xValue - 3;
            System.out.println(xValue +"\t" +yValue +"\t");
            xValue = xValue + step;
        }
    }
}