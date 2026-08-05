class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int len=0;
        int ans=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr = num;
                len=1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}
