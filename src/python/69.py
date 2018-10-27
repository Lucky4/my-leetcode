class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0
        
        l = 1
        r = x
        
        while l <= r:
            m = (l + r) / 2
            
            if m * m > x:
                r = m - 1
            elif (m + 1) * (m + 1) > x:
                return m
            else:
                l = m + 1