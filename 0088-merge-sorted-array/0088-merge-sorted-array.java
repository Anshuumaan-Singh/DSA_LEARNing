class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int crr[] = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                crr[k++] = arr1[i++];
            }
            else{
                crr[k++] = arr2[j++];
            }
        }
        while(i<m){
            crr[k++] = arr1[i++]; 
        }
        while(j<n){
            crr[k++] = arr2[j++];
        }
        for(int l= 0; l<arr1.length; l++){
            arr1[l] = crr[l];
        }
    }
}