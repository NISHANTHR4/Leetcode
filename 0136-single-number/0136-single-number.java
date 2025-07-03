class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int count=0;
       for(int num:nums){
        if(map.containsKey(num)){
            count=map.get(num);
            map.put(num,count+1);
        }
        else{
            map.put(num,1);
        }
       }
       for(int num:nums){
        if(map.get(num)==1){
            return num;
        }
       }
       return -1;
    }
}