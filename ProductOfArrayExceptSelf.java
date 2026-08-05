class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length];
        p[0] = 1;
        for(int i=1;i<nums.length;i++){
            p[i] = p[i-1]*nums[i-1];
        }
        int s=1;
        for(int i=nums.length-1;i>=0;i--){
            p[i] = p[i]*s;
            s*=nums[i];
        }
        return p;
    }
}
//[1, 2, 3, 4] -> nums,
//[1, 1, 2, 6] -> prefix
//[24,12,4, 1] -> suffix
//[24,12,8, 6]
//Dynamic programming
//TC = SC = O(2n) -> O(n)
