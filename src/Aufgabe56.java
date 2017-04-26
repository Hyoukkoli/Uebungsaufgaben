class Aufgabe56{
    static int minimumSuche(int [] r, int s){
        int wertMerker = r[s];
        int indexMerker = s;
        int index = s;
        int length = r.length;
        while (index < length){
            if(r[index] < wertMerker){
                wertMerker = r[index];
                indexMerker = index;
            }
            index = index + 1;
        }
        return indexMerker;
    }

    static void ausgabe(int[] a){
        for (int index = 0; index < a.length; index++)
            System.out.println(a[index]);
        return;
    }

    public static void main(String[] args){
        int[] zahlenfolge = {19,18,15,13,6,8};
        int length = zahlenfolge.length;
        int index = 0;
        int minimumindex;
        while (index < length-1){
            minimumindex = minimumSuche(zahlenfolge, index);
            int merker = zahlenfolge[index];
            zahlenfolge[index] = zahlenfolge[minimumindex];
            zahlenfolge[minimumindex] = merker;
            index = index + 1;
        }

        ausgabe(zahlenfolge);

/*        index = 0;
        while (index < length){
            System.out.println(zahlenfolge[index]);
            index = index + 1;
*/
    }
}