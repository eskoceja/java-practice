package CodingBat;

public class Array1 {

    /*1
     * Given an array of ints, return true if 6 appears as
     * either the first or last element in the array.
     * The array will be length 1 or more.*/
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    /*2
     * Given an array of ints, return true if the array
     * is length 1 or more, and the first element and
     * the last element are equal.*/
    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    /*3
     * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.*/
    public int[] makePi() {
        int[] PI = {3, 1, 4};
        return PI;
    }

    /*4
     * Given 2 arrays of ints, a and b, return true
     * if they have the same first element or
     * they have the same last element. Both arrays will be length 1 or more.*/
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else {
            return false;
        }

    }

    /*5
     *Given an array of ints length 3, return the sum of all the elements. */
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }
}