class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res=[]
        strs.sort()
        first=list(strs[0])
        last=list(strs[len(strs)-1])

        for i in range(0,min(len(first),len(last))):
            if(first[i]!=last[i]):
                break
            res.append(first[i])
        return "".join(res)
        