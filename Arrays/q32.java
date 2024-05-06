/*
32.Write a Java program to get the majority element from an array of integers containing duplicates. 
Majority element: A majority element is an element that appears more than n/2 times where n is the array size.
*/

public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       return nums[nums.length/2]; 
    }

  
