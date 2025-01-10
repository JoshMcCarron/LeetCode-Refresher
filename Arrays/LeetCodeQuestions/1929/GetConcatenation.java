

public class GetConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for (int i = 0,j = nums.length;i<nums.length;i++,j++){
            ans[i] = nums[i];
            ans[j]= nums[i];
        }


        return ans;
    }

    public int[] getConcatenation2(int[]nums){
        int n = nums.length;
        int[] ans = new int[n*2];
        for (int i = 0; i < nums.length;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
