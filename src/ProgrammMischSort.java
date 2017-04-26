class ProgrammMischSort{
    static int[] mische(int[] array1, int[] array2){
        int length1 = array1.length;
        int length2 = array2.length;
        int length = length1+length2;
        int[] array = new int[length];
        int index1,index2,index;
        index=0;
        index1=0;
        index2=0;
        while (index1<length1 & index2<length2){
            if (array1[index1] <= array2[index2]){
                array[index] = array1[index1];
                index1 = index1+1;
                index = index+1;
            }
            else {
                array[index] = array2[index2];
                index2 = index2+1;
                index = index+1;
            }
        }
        if (index1==length1){
            while (index2<length2){
                array[index] = array2[index2];
                index2 = index2+1;
                index = index+1;
            }
        }
        if (index2==length2){
            while (index1<length1){
                array[index] = array1[index1];
                index1 = index1+1;
                index = index+1;
            }
        }
        return array;
    }


    static int[] mischSort(int[] array){
        int length = array.length;
        if (length > 1){
            int length1 = length / 2;
            int length2 = length - length1;
            int[] helpArrayLeft = new int[length1];
            int i = 0;
            while (i < length1){
                helpArrayLeft[i] = array[i];
                i = i + 1;
            }
            int[] arrayLeft = mischSort(helpArrayLeft);
            int[] arrayRight = new int[length2];
            i = 0;
            while (i < length2){
                arrayRight[i] = array[length1 + i];
                i = i + 1;
            }
            int[] frechts = mischSort(arrayRight);
            return mische(arrayLeft, frechts);
        }
        else return array;
    }


    public  static  void main(String[] args){
        int[] inputArray = {11,7,8,3,15,13,9,19,18,10,4};
        int length = inputArray.length;
        int[] outputArray = mischSort(inputArray);
        int index = 0;
        while (index < length){
            System.out.println(outputArray[index]);
            index = index + 1;
        }
    }
}
