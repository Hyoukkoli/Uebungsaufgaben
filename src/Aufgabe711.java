class Aufgabe711{

    float[] vectorComponents;

    Aufgabe711(float x, float y, float z){
        vectorComponents = new float [3];
        vectorComponents[0] = x;
        vectorComponents[1] = y;
        vectorComponents[2] = z;
        }

    Aufgabe711(float[] vectorValues){
        vectorComponents = vectorValues;
    }


    float giveValue(int index) {
        if (index < vectorComponents.length) {
            return vectorComponents[index];
        }
        return -100000F;
    }


    int giveMinimum(){
        int index = 0;
        float smallestValue = vectorComponents[0];
        for (int i = 1; i < vectorComponents.length; i++){
            if (smallestValue > vectorComponents[i]){
                smallestValue = vectorComponents[i];
                index = i;
            }
        }
        return index;
    }
}