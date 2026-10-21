class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> frequencyMap = Arrays.stream(nums).boxed()
            .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        var queue = new PriorityQueue<Map.Entry<Integer, Long>>(
            Comparator.comparingLong(Map.Entry::getValue) 
        );

        frequencyMap.entrySet().forEach(entry -> {
            queue.add(entry);
            if (queue.size() > k) {
                queue.poll(); 
            }
        });

        int[] result = new int[k];
        int i = 0;
        while (!queue.isEmpty()) {
            result[i++] = queue.poll().getKey();
        }

        return result;
    }
}
