package leetCode;

public class GooddPairs {
    public int numIdenticalPairs(int[] nums) {
        int gp=0;
        for(int i=0;i<nums.length-1;++i){
            for(int j=i+1;j<nums.length;++j){
                if(nums[i]==nums[j]){
                    gp++;
                }
            }

        }

        return gp;

    }
}
