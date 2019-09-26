public class 01_PhoneNumberConbination {
    String[] chars = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> state = new ArrayList<>(); 
        //起先state状态变量是一个空集合，首先肯定是先把单个数字对应的字符装进集合，但是是now集合
        if(digits == null || digits.length() == 0) { return state; }        
        for(char digit : digits.toCharArray()) { 
            //每到一个新的字母，now集合都是新的集合，这样可以对原先的state集合更新，每加完一个字母进集合，state = now
            List<String> now = new ArrayList<>();
            if(state.size() == 0) {
                for(char c : chars[digit - '2'].toCharArray()) {
                    now.add(c+"");
                }
            } else {
                for(char c : chars[digit - '2'].toCharArray()) {
                    for(String str : state) 
                        now.add(str+c);
                }
            }
            state = now;
        }
        return state;
    }
}
