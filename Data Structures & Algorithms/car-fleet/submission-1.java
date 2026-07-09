class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       Map<Integer, Double> map = new TreeMap<>(Collections.reverseOrder());
       for(int i=0;i<position.length;i++)
       {
        double time = ((double)target-(double)position[i])/(double)speed[i];
        map.put(position[i],time);
       }
        int len = position.length;
        Stack<Double> s1 = new Stack<>();
        for(double time : map.values())
        {
            if(s1.isEmpty() || time>s1.peek())
                s1.push(time);
        }
        return s1.size();
    }
}
