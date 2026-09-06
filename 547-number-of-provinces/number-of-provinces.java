class Solution {
    public int findCircleNum(int[][] nums) {
        int n=nums.length;
        int count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                bfs(i,visited,nums);
                count++;
            }
        }
        return count;
        
    }
    public void bfs(int Node ,boolean[]visited,int[][]nums){
        int n=nums.length;
        Queue<Integer> q =new LinkedList<>();
        q.add(Node);
        visited[Node]=true;

        while(q.size()>0){
            int front=q.remove();

            for(int col=0;col<n;col++){
                if(nums[front][col]==1 && visited[col]==false){
                    q.add(col);
                    visited[col]=true;
                }
            }
        }
    }
}