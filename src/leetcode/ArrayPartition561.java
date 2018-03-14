package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/array-partition-i/
 */
public class ArrayPartition561 {
  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;
    for(int i = 0; i < nums.length - 1; i+=2) {
      sum += Math.min(nums[i], nums[i+1]);
    }
    return sum;
  }
  public static void main(String[] args) {
    ArrayPartition561 solution = new ArrayPartition561();
    int[] nums = {5, 8, 7, 6};
    System.out.println(solution.arrayPairSum(nums));
  }
}
