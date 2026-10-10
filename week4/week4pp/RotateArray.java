import java.util.*;
public class RotateArray {
    static void rotate(int[] nums, int k) {
        if (nums.length == 0) return;
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    static void reverse(int[] a, int l, int r) { while(l<r) { int t=a[l]; a[l++]=a[r]; a[r--]=t; } }
    public static void main(String[] args) { int[] a={1,2,3,4,5,6,7}; rotate(a,3); System.out.println(Arrays.toString(a)); }
}
