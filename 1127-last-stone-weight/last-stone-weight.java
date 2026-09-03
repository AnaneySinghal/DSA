class Solution {
    public int lastStoneWeight(int[] stones) {
          PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
          for(int ele:stones){
            pq.add(ele);
          }
          
          while(pq.size()>1){
            
            
            int top=pq.remove();
            int sectop=pq.remove();

            if(top!=sectop){
                pq.add(top-sectop);
            }
            else {
                pq.add(0);
            }
            
          }
            return pq.peek();
        
    }
}