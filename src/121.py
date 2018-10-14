class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        num_length = len(prices)
        curr_sum = 0
        max_sum = 0
        min_pos = 0
        
        for i in range(1, num_length):
            if prices[i] < prices[min_pos]:
                min_pos = i
                continue
                
            curr_sum = prices[i] - prices[min_pos]
            
            if curr_sum > max_sum:
                max_sum = curr_sum
                
        return max_sum