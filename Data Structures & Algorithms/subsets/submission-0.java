class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        result(nums,list,0);
        return res;
    }
    private void result(int[] arr,List<Integer> list,int i)
    {
        if(i == arr.length)
        {
            res.add(new ArrayList<>(list));
            return;
            
        }
        list.add(arr[i]);
        result(arr,list,i+1);
        list.remove(list.size() - 1);
        result(arr,list,i+1);

    }
    
}
