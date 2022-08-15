class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            
            String s = sentences[i];
            String[] s1=s.split("\\s");
            if(s1.length>ans)
                ans=s1.length;
                
        }
        
        return ans;
    }
}
