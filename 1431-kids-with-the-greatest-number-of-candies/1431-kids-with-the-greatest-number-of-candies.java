class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = Integer.MIN_VALUE;
        for(int num : candies){
            m = Math.max(num, m);
        }
        ArrayList<Boolean> b = new ArrayList<>();

        for(int num : candies){
            b.add((num + extraCandies) >= m);
        }
        return b;
    }
}