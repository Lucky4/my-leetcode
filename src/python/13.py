class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        symbol_value = {
            'I' : 1,
            'V' : 5,
            'X' : 10,
            'L' : 50,
            'C' : 100,
            'D' : 500,
            'M' : 1000
        }
        
        s_length = len(s)
        
        if s_length == 0:
            return 0
        
        if s_length == 1:
            return symbol_value[s[0]]
        
        res = symbol_value[s[s_length - 1]]
        
        for i in range(s_length - 2, -1, -1):
            if symbol_value[s[i]] < symbol_value[s[i + 1]]:
                res -= symbol_value[s[i]]
            else:
                res += symbol_value[s[i]]
                
        return res