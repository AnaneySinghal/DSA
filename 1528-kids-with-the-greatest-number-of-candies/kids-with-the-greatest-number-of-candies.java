class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int extraCandies) {

        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int max = nums[i] + extraCandies;
            boolean isMax = true;
             for (int j = 0; j < nums.length; j++) {
                if (max < nums[j]) {
                    isMax = false;
                    break;
                }
            }

            list.add(isMax);
        }

        return list;
    }
}