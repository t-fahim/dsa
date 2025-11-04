# leetcode 1. Two Sum
# https://leetcode.com/problems/two-sum/description

from typing import List, Dict, Tuple, Optional

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # create a dictionary to store numbers and their indices
        map = {}

        #iterating through the array
        for i in range(len(nums)):
            # calculate the complement of the current number
            complement = target - nums[i]

            # check if the complement is already in the map
            if complement in map:
                # if found, return the indices of the complement and the curent number
                return [i,map[complement]]

            # otherwise, add the current number and index to the map
            map[nums[i]] = i

        # return an empty array if no solution is found
        return []



if __name__=='__main__':
    nums = [2,7,11,15]
    target = 9
    sol = Solution()
    print(sol.twoSum(nums,target))




