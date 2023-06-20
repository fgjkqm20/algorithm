class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        boolean isOdd = false;
        
        for(int idx=0; idx<code.length(); idx++, isOdd = !isOdd) {
            char ch = code.charAt(idx);
            
            if(ch == '1') {
                mode = !mode;
                continue;
            }
            
            if(mode == isOdd) {
                ret += ch;
            }
        }

        return ret.equals("") ? "EMPTY" : ret;
    }
}