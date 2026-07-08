class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer,Integer>();
        for(int i: nums){
            map.merge(i, 1,Integer::sum);
        }
        var queue = new PriorityQueue<int[]>((a,b)-> a[1] - b[1]);
        for(var entry : map.entrySet()){
            queue.add(new int[]{entry.getKey(),entry.getValue()});
            if(queue.size() > k){
                queue.poll();
            }
        }
        int[] arr = new int[k];
        int i=0;
        for(var entry : queue){
            arr[i++] = entry[0];
        }
        return arr;
    }
}
