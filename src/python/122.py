class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max_profit = 0
        prices_length = len(prices)
        
        for i in range(prices_length-1):
            if prices[i] < prices[i+1]:
                max_profit += prices[i+1] - prices[i]
                
        return max_profit