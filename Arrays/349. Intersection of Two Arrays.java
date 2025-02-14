class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> tempList = new ArrayList<>();
        int i = 0, j = 0;
        int prev = Integer.MIN_VALUE;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (prev != nums1[i]) {
                    tempList.add(nums1[i]);
                    prev = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        // Convert List to int array
        int[] result = new int[tempList.size()];
        for (int k = 0; k < tempList.size(); k++) {
            result[k] = tempList.get(k);
        }
        return result;
    }
}
