/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution189;

/**
 *
 * @author DELL
 */
public class Solution {

    public static void rotate(int[] nums, int k) {
       int n = nums.length;
        k = k % n;

        int[] b = new int[nums.length];

        // for (int i = 0; i < k; i++) {
        //     b[i] = nums[n - k + i];
        // }

        // for (int i = k; i < n; i++) {
        //     b[i] = nums[i - k];
        // }

      
        // System.arraycopy(b, 0, nums, 0, n);


    System.arraycopy(nums, n - k, b, 0, k);

    System.arraycopy(nums, 0, b, k, n - k);

    System.arraycopy(b, 0, nums, 0, n);
        

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3,4};
        int k = 3;
        rotate(a, k);
        for (int num : a) {
        System.out.print(num + " ");
    }
        
    }
}
