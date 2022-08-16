class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            int x=Character. getNumericValue(ch);
            if(x>ans)
                ans=x;
        }
        
        return ans;
    }
}
