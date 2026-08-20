class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2

Input:
nums = [0,1,0,3,12]

Output:
[1,3,12,0,0]

Expected:
[1,3,12,0,0]