class Solution {
    public String reverseWords(String s) {
    //    String[]words = s.split("\\s+");
    //    StringBuilder sb = new StringBuilder();

    //    for(int i=words.length-1;i>=0;i--){
    //       sb.append(words[i]);
    //       if(i!=0){
    //       sb.append(" ");}
    //    } 
    //    return sb.toString().trim();
    s.trim();
     String []word=s.split("\\s+");
        String []rev=new String[word.length];
        int index=0;
        for(int i= word.length-1;i>=0;i--)
        {
            rev[index]=word[i];
            index++;
        }
        String r=String.join(" ",rev);
        return r.trim();
    }
}