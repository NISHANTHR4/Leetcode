class Solution {
    public boolean wordPattern(String pattern, String s) {
        String s1[] = s.split(" ");
        if(s1.length!=pattern.length()) return false;

        HashMap <Character,String> m1=new HashMap<>();
        HashMap <String,Character> m2=new HashMap<>();

        for(int i=0;i<s1.length;i++){
            char c=pattern.charAt(i);
            String word=s1[i];
            if(m1.containsKey(c)){
                if(!m1.get(c).equals(word)) return false;
            }else{
                if(m2.containsKey(word)) return false;
                m1.put(c,word);
                m2.put(word,c);
            }
        }
        return true;
    }
}