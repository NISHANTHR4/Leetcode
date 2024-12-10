class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int n:candies){
            if(n>max){
                max=n;
            }
        }
        List<Boolean> candy=new ArrayList<>();
        for(int n:candies){
            if(n+extraCandies>=max){
            candy.add(true);
            }
            else{
                candy.add(false);
            }
        }
        return candy;
    }
}