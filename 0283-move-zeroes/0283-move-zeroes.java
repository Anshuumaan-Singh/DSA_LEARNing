class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int z = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
  