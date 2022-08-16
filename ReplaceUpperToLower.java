class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int x=(int)s.charAt(i);
            if(x>64 && x<91 ){
                x=x+32;
                sb.append((char)x);
            }
            else{
                sb.append((char)x);
            }
        }
        return sb.toString();
    }
}
