# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if head == None or head.next == None:
            return True
        
        slow = head
        fast = head.next
        
        while fast.next != None and fast.next.next != None:
            slow = slow.next
            fast = fast.next.next
            
        fast = slow.next
        slow.next = None
        slow = head
        
        fast = self.reverse(fast)
        
        return self.checkPalindrome(slow, fast)
        
    def reverse(self, head):
        new_head = None
        
        while head != None:
            tmp = head.next
            head.next = new_head
            new_head = head
            head = tmp
            
        return new_head
    
    def checkPalindrome(self, slow, fast):
        while slow != None and fast != None:
            if slow.val == fast.val:
                slow = slow.next
                fast = fast.next
                continue
                
            return False
        
        return True
        