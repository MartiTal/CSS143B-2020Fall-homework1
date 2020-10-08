public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        if (data == null || data.length == 0) { //If we are given an empty array, of course we will not find the target
            return -1;
        }

        /*if (data.length == 1) {
            if (data[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }    I found that once I fixed my logic error, I didn't need this part. */

        int start = 0; //The leftmost boundary of our search
        int end = data.length - 1; //The rightmost boundary of our search
        int newindex = (start + end)/2; //This is the value we will be comparing to target, it will represent all of the midpoint values

        /* I changed the while loop to keep running until the target cannot exist in between the start and end indexes
        * of our search */
        while (data[start] < target && data[end] > target) {

            if (data[newindex] == target) {

                /* Finding the target does not mean it is the first instance of this value in the array,
                because the array is assumed to be sorted we can keep checking to the immediate left until
                we find the first index where the target can be found. */
                while (newindex > 0 && data[newindex-1] == target) { //Without the > 0 newindex can become -1 and cause an out of bounds exception
                    newindex--;
                }
                return newindex; //Because the loop ends as soon as newindex is no longer a solution

                /* I struggled with this problem for way too long, not understanding what I was doing wrong.
                * I had the logic right here backwards, I used > when I should have used < when I initially wrote this
                * part. I spent a lot of unnecessary time and I feel so stupid, but it works now at least. */
            } else if (data[newindex] < target){ //Limit search to upper section

                start = newindex + 1;


            } else { //Limit search to lower section

                end = newindex - 1;

            }
            newindex = (start + end)/2;

        }

        //The final check, to see if either of our endpoints is actually equal to the target, otherwise it does not exist
        if (data[start] == target) {
            return start;
        } else if (data[end] == target) {
            return end;
        } else {
            return -1;
        }

    }
}
