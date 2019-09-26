public class 01_PhoneNumberConbination {
    String[] chars = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> state = new ArrayList<>();
        if(digits == null || digits.length() == 0) { return state; }        
        for(char digit : digits.toCharArray()) {
            //每到一个新的字母now集合都是新的集合
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
