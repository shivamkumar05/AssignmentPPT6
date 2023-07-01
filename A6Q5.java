import java.util.*;
public class A6Q5 {
    static int minProductSum(int[] nums1, int[] nums2) {
        int ans = 0;
        // Sort nums1 and nums2 in ascending order.
        Arrays.sort(nums2);
        Arrays.sort(nums1);

        int i = 0;
        int j = nums2.length-1;
        // Iterate over two sorted arrays and calculate the
        // cumulative product sum.
        while(i < nums1.length && j >= 0)
        {
            ans += nums1[i] * nums2[j];
            i++;
            j--;
        }

        return ans;
    }

    public static void main(String[] args) {

        int [] nums1 = {5,3,4,2}, nums2 = {4,2,2,5};
        System.out.println(minProductSum(nums1, nums2));

    }

}
