# 219. Contains Duplicate II
# https://leetcode.com/problems/contains-duplicate-ii/description/

from typing import List, Dict, Tuple, Optional

class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        # Create a set to store unique elements in the sliding window
        seen_nums = set()
        # Iterate through the array
        for i in range(len(nums)):
            # Check if current number already exists in set
            if nums[i] in seen_nums:
                return True

            # Add current number to set
            seen_nums.add(nums[i])

            # Maintain the sliding window of size k
            if len(seen_nums) > k:
                seen_nums.remove(nums[i-k])
        return False # No duplicates found within distance k






if __name__ == '__main__':
    nums = [1, 2, 3, 1]
    k = 3
    sol = Solution()
    print(sol.containsNearbyDuplicate(nums, k))
