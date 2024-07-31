class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        if(str.length()==0) return -1;
        if(str.length()==1) return 1;
        int count=0;
       
        
         int right=str.length()-1;
        for(int i=right;i>=0;i--)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}