class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i=0; i<arr.length-1; i++){
            int v = Math.abs(arr[i]-arr[i+1]);
            if (min>v){
                min = v;
            }
        }
        List<List<Integer>> mainal = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            // List<Integer> al = new ArrayList<>();
            if(Math.abs(arr[i] - arr[i+1]) == min){
                // al.add(arr[i]);
                // al.add(arr[i+1]);
                mainal.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return mainal;
    }
    
}