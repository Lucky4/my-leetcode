class Solution(object):
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        s_length = len(s)
        
        dp = [False] * (1 + s_length)
        dp[0] = True
        
        for i in range(1, s_length + 1):
            for j in range(i):
                if dp[j] and s[j:i] in wordDict:
                    dp[i] = True
                    break
                    
        return dp[s_length]