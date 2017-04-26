class Aufgabe58{
    static int maximumSuche(int [] r, int s){
        int wertMerker = r[s];
        int indexMerker = s;
        int index = s;
        int length = r.length;
        while (index < length){
            if(r[index] > wertMerker){
                wertMerker = r[index];
                indexMerker = index;
            }
            index = index + 1;
        }
        return indexMerker;
    }

    public static void main(String[] args){
        int[] zahlenfolge = {19,18,15,13,6,8};
        int length = zahlenfolge.length;
        int index = 0;
        int minimumindex;
        while (index < length-1){
            minimumindex = maximumSuche(zahlenfolge, index);
            int merker = zahlenfolge[index];
            zahlenfolge[index] = zahlenfolge[minimumindex];
            zahlenfolge[minimumindex] = merker;
            index = index + 1;
        }
        index = 0;
        while (index < length){
            System.out.println(zahlenfolge[index]);
            index = index + 1;
        }
    }
}