class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums1) {
            set.add(val);
        }

        HashSet<Integer> result = new HashSet<>();
        for (int val : nums2) {
            if(set.contains(val)){
                result.add(val);
            }
        }
        int[] res = new int[result.size()];
        int i = 0;
        for (int val : result) {
            res[i] = val;
            i++;
        }
        return res;
    }
}