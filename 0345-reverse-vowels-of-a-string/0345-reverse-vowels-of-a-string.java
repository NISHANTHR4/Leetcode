class Solution {
    public String reverseVowels(String s) {
       char c[]=s.toCharArray();
       int left=0;
       int right=c.length-1;
       
       
       String vowels="AEIOUaeiou";
       while(left<right)
       {
        while(left<right && vowels.indexOf(c[left])==-1)
        {
            left++;
        }
        while(left<right && vowels.indexOf(c[right])==-1)
        {
            right--;
        }
        char temp=c[left];
        c[left]=c[right];
        c[right]=temp;
        left++;
        right--;
       }
       return String.valueOf(c);
    }
}