class Solution {
    public int[][] transpose(int[][] nums) {
        int[][] ans = new int[nums[0].length][nums.length];

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=nums[j][i];
            }
        }
        return ans;
    }
}