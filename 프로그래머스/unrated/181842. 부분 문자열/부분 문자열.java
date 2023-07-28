class Solution {
    public int solution(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        for(int i=0; i<=length2-length1;i++) {
            String substring = str2.substring(i, i+length1);

            if(str1.equals(substring)) {
                return 1;
            }
        }

        return 0;
    }
}