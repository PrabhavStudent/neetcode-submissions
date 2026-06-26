/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        int conflict = 0;
        int[] start = new int[n];
        int[] end =  new int[n];
        for(int i=0;i<n;i++)
        {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=1;i<n;i++)
        {
            if(start[i]<end[i-1])
            {return false;
            }
        }
        return true;
    }
}
