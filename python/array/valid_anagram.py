# 242. Valid Anagram
# https://leetcode.com/problems/valid-anagram/description/

from typing import List, Dict, Tuple, Optional

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # check if length is different
        if len(s) != len(t):
            return False
        # creating an array to cont character frequence
        char_list = [0]*26

        # increment count for each character in 's' and decrement for each in 't'
        for i in range(len(s)):
            char_list[ord(s[i])-ord('a')] += 1
            char_list[ord(t[i])-ord('a')] -= 1

        # check if all counts are zero
        for num in char_list:
            if num != 0:
                return False

        return True # all count are zero






if __name__ == '__main__':
    s = "anagram"
    t = "nagaram"
    sol = Solution()
    print(sol.isAnagram(s,t))
