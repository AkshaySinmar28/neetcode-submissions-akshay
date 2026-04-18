class Solution {
    public int lastStoneWeight(int[] stones) {
        var pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        pq.addAll(Arrays.stream(stones).boxed().toList());
        while(pq.size() > 1){
            var a = pq.poll();
            var diff = a - pq.poll();
            if(diff != 0){
                pq.offer(diff);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
