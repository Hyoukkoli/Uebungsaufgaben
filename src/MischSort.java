class MischSort{

    static int[] mische(int[] array1, int[] array2){
        int length1 = array1.length;
        int length2 = array2.length;
        int length = length1+length2;
        int[] array = new int[length];
        int index1,index2,index;
        index=0;
        index1=0;
        index2=0;
        while (index1<length1 & index2<length2){   // f1 und f2 nicht leer:
            if (array1[index1] <= array2[index2]){ // erstes Element aus f1
                array[index] = array1[index1];       // uebernehmen
                index1 = index1+1;
                index = index+1;
            }
            else {                 // erstes Element aus f2
                array[index] = array2[index2];       // uebernehmen
                index2 = index2+1;
                index = index+1;
            }
        }
        if (index1==length1){             // f1 leer:
            while (index2<length2){         // f2 anfuegen
                array[index] = array2[index2];
                index2 = index2+1;
                index = index+1;
            }
        }
        if (index2==length2){             // f2 leer:
            while (index1<length1){         // f1 anfuegen
                array[index] = array1[index1];
                index1 = index1+1;
                index = index+1;
            }
        }
        return array;
    }                            // mische#

    static int[] mergeRecursive(int[] left, int[] right, int leftPosition, int rightPosition, int[] result, int resultPosition)
    {

        if (resultPosition == result.length) {
            return result;
        }

        if (leftPosition >= left.length){
            result[resultPosition] = right[rightPosition];
            rightPosition = rightPosition + 1;
            resultPosition = resultPosition + 1;
            return mergeRecursive(left, right, leftPosition, rightPosition, result, resultPosition);
        }
        int leftValue = left[leftPosition];

        if (rightPosition >= right.length){
            result[resultPosition] = left[leftPosition];
            leftPosition = leftPosition + 1;
            resultPosition = resultPosition + 1;
            return mergeRecursive(left, right, leftPosition, rightPosition, result, resultPosition);
        }

        int rightValue = right[rightPosition];

        if (leftValue >= rightValue) {
            result[resultPosition] = rightValue;
            rightPosition = rightPosition + 1;
            resultPosition = resultPosition + 1;
            return mergeRecursive(left, right, leftPosition, rightPosition, result, resultPosition);
        } else {
            result[resultPosition] = leftValue;
            leftPosition = leftPosition + 1;
            resultPosition = resultPosition + 1;
            return mergeRecursive(left, right, leftPosition, rightPosition, result, resultPosition);
        }

    }


    static int[] mischSort(int[] array){

        int length = array.length;

        if (length == 1) {
            return array;
        }

        int lengthLeft = length / 2;
        int lengthRight = length - lengthLeft;

        int[] helpArrayLeft = new int[lengthLeft];
        int index = 0;
        while (index < lengthLeft){
            helpArrayLeft[index] = array[index];
            index = index + 1;
        }

        int[] helpArrayRight = new int[lengthRight];
        index = 0;
        while (index < lengthRight){
            helpArrayRight[index] = array[lengthLeft + index];
            index = index + 1;
        }

        return
            mische(
                mischSort(helpArrayLeft),
                mischSort(helpArrayRight)
        );
    } // mischSort


        public static void main(String[] args){
            int[] arrayA = {1,3,8,17,22};
            int[] arrayB = {2,7,11,16};
            int[] result = new int [arrayA.length + arrayB.length];
            mergeRecursive(arrayA, arrayB, 0, 0, result, 0);

            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }  // main
     // ProgrammMischSort

}