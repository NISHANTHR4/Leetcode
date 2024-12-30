class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels=new HashSet<>();
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');
        int windowCount=0;
        int maxVowels=0;
        for(int i=0;i<k;i++)
        {
            if(vowels.contains(s.charAt(i)))
            {
                windowCount++;
            }
        }
        maxVowels=windowCount;
        for(int i=k;i<s.length();i++)
        {
            if(vowels.contains(s.charAt(i-k)))
            {
                windowCount--;
            }
             if(vowels.contains(s.charAt(i)))
            {
                windowCount++;
            }
            maxVowels=Math.max(maxVowels,windowCount);
        }
        return maxVowels
        ;
    }
}