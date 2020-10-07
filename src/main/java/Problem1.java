public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        if (data == null || data.length == 0) { //If we are given an empty array, of course we will not find the target
            return -1;
        }

        if (data.length == 1) {
            if (data[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int oldindex = -1; //oldindex will be set to the last index value we tried, if we did not find the target
        int start = 0;
        int end = data.length - 1;
        int newindex = (start + end)/2; //Start at the midpoint

        /* We want to continue running through the array until we are trying the same index over and over, meaning
        the target value does not exist */
        while (oldindex != newindex) {

            if (data[newindex] == target) {

                /* Finding the target does not mean it is the first instance of this value in the array,
                because the array is assumed to be sorted we can keep checking to the immediate left until
                we find the first index where the target can be found. */
                while (newindex > 0 && data[newindex-1] == target) { //Without the > 0 newindex can become -1 and cause an out of bounds exception
                    newindex--;
                }
                return newindex; //Because the loop ends as soon as newindex is no longer a solution

            } else if (data[newindex] > target){ //Limit search to upper section

                start = newindex + 1;


            } else { //Limit search to lower section

                end = newindex - 1;

            }
            oldindex = newindex;
            newindex = (start + end)/2;

        }
        return -1;
    }
}
