class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pIdx = 0;
        int nIdx = 1;
        for(int num : nums){
            if(num%2 == 0){
                arr[pIdx] = num;
                pIdx+=2;
            }
            else{
                arr[nIdx] = num;
                nIdx+=2;
            }
        }
        return arr;
    }
}