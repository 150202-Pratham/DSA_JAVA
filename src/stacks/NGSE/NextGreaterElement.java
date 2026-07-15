package stacks.NGSE;

import java.util.Arrays;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = {4, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int indexInNums2 = -1;

            // Find index of nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    indexInNums2 = j;
                    break;
                }
            }

            // Now find next greater element
            int nextGreater = -1;
            for (int k = indexInNums2 + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            result[i] = nextGreater;
        }

        System.out.println(Arrays.toString(result));
    }
}
