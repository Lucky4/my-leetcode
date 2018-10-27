import static java.lang.Math.*;


class Solution {
    public int titleToNumber(String s) {
        if (s.length() == 0) {
        	return 0;
        }
        
        int res = 0;
        int exp = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
        	int base = s.charAt(i) - 'A' + 1;
            
        	res += base * pow(26, exp);
        	exp += 1;
        }
        
        return res;
    }
}