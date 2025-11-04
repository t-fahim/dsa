# 217. Contains Duplicate
# https://leetcode.com/problems/contains-duplicate/description/

from typing import List, Dict, Tuple, Optional

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # Create set to store unique elements from the array
        seen_number = set()
        for num in nums:
            # check if the element is already in the hashset
            if num in seen_number:
                return True
            # add element to set
            seen_number.add(num)

        return False # no duplicate





if __name__ == '__main__':
    nums = [1,2,3,1]
    sol = Solution()
    print(sol.containsDuplicate(nums))

