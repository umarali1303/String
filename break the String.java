class Solution {
    public int balancedStringSplit(String s) {
        int ans=0,r=0,l=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='R'){
              ++r;
              if(r==l){
                  ans++;
                  r=0;
                  l=0;
              }
          }
        else{
            ++l;
            if(r==l){
                  ans++;
                  r=0;
                  l=0;
        }
    }
}
        return ans;
    }
}
