class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        arr = [char.lower() for char in s if char.isalnum()]
        n=len(arr)
        i=0
        j=n-1
        while(i<j):
            if(arr[i]==arr[j]):
                i+=1
                j-=1
            else:
                return False
        
        return True
        