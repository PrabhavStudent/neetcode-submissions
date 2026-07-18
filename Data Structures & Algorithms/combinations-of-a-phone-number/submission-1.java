class Solution {
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(0,"");
        map1.put(1,"");
        map1.put(2,"abc");
        map1.put(3,"def");
        map1.put(4,"ghi");
        map1.put(5,"jkl");
        map1.put(6,"mno");
        map1.put(7,"pqrs");
        map1.put(8,"tuv");
        map1.put(9,"wxyz");
        int index = 0;
        List<String> ans = new ArrayList<>();
        if(digits.length()==0)
        return ans;
        result(digits,ans,map1,index);
        return res;
    }
    private void result(String digits,List<String> list,HashMap<Integer,String>map,int index)
    {
        if(index >= digits.length())
        {
            res.add(String.join("", list));
            return;
        }
        int num = digits.charAt(index) - '0';
        String value = map.get(num);
        for(int i=0;i<value.length();i++)
        {
            list.add(String.valueOf(value.charAt(i)));
            result(digits,list,map,index+1);
            list.remove(list.size()-1);
        }
    }
}
