class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        

        PriorityQueue<Character> heap = new PriorityQueue<>(
            (e1,e2)-> Character.compare(e2,e1)
        );

        for(char c:map.keySet()){
            heap.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        
        while(!heap.isEmpty()){
            char curChar = heap.poll();
            int curCount = map.get(curChar);
            int limit = Math.min(curCount,repeatLimit);
            for(int i=0;i<limit;i++){
                sb.append(curChar);
            }
            map.put(curChar,curCount-limit);

            if(map.get(curChar)>0 && !heap.isEmpty()){
                char nxtChar = heap.poll();
                sb.append(nxtChar);
                map.put(nxtChar,map.get(nxtChar)-1);
                if(map.get(nxtChar)>0){
                    heap.offer(nxtChar);
                }
                heap.offer(curChar);
            }

            
        }         
        return sb.toString();
    }
}
