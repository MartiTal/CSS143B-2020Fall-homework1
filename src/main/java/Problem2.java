public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        if (data == null) {
            return;
        }

        boolean isOk = false;
        while (!isOk) {
            isOk = !(swapIfNecessary(data));
            //If we swapped something, the array is not guaranteed to be fully sorted.
            //However, if nothing was swapped, the array is sorted.
        }
    }

    //I wanted to try creating another method to handle the actual swapping and return a boolean to keep track of any swaps
    public static boolean swapIfNecessary(int[] data) {
        boolean didSwap = false; //We assume the algorithm is sorted until something is swapped during this run through it.

        //To avoid out of bounds, this for loop will run through the second to last element in the array, since
        //it switches the element with the one in front of it (if necessary). This ends up being two less than the
        //array's length.
        for (int i = 0; i <= data.length - 2; i++) {
            if (data[i] > data[i+1]) { //If this number is larger than the next one in the array, swap them
                int temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;

                didSwap = true;  //Record that we swapped at least once
            }
        }
        return didSwap;
    }

}
