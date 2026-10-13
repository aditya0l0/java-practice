package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for nums1
        System.out.print("Enter total size of nums1 (m + n): ");
        int total = sc.nextInt();

        int[] nums1 = new int[total];

        System.out.println("Enter elements of nums1 (including extra zeros):");
        for (int i = 0; i < total; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input for nums2
        System.out.print("Enter size of nums2 (n): ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int m = total - n;

        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));

        sc.close();
    }
}
