import java.util.ArrayList;

public class unionoftwoarray {
    public static void unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i])
                    arr.add(nums1[i]);
                i++;
            } else if (nums2[j] < nums1[i]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != nums2[j])
                    arr.add(nums2[j]);
                j++;
            } else { // nums1[i] == nums2[j]
                if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i])
                    arr.add(nums1[i]);
                i++;
                j++;
            }
        }
             while (i < nums1.length) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i])
                arr.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != nums2[j])
                arr.add(nums2[j]);
            j++;
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 ,8,8};
        int[] nums2 = { 1, 2,6,6, 7 };
        unionArray(nums1, nums2);
    }
}