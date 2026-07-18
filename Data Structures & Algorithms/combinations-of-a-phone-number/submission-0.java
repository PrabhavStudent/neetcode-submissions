class Solution {
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        

        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index = 0;
        List<String> ans = new ArrayList<>();
        if(digits.length()==0)
        return ans;
        result(digits,ans,map,index);
        return res;
    }
    private void result(String digits,List<String> list,String[] map,int index)
    {
        if(index >= digits.length())
        {
            res.add(String.join("", list));
            return;
        }
        int num = digits.charAt(index) - '0';
        String value = map[num];
        for(int i=0;i<value.length();i++)
        {
            list.add(String.valueOf(value.charAt(i)));
            result(digits,list,map,index+1);
            list.remove(list.size()-1);
        }
    }
}
