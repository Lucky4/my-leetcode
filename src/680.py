class Solution(object):
    def validPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        i = 0
        j = len(s)-1

        while i < j:
            if s[i] == s[j]:
                i += 1
                j -= 1
                continue
            
            return self.helper(s, i+1, j) or self.helper(s, i, j-1)
        
        return True

    def helper(self, s, start, end):
        while start < end:
            if s[start] == s[end]:
                start += 1
                end -= 1
                continue
            
            return False

        return True