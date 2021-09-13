class Solution {
    int fun(int first,int last,char[] s){
            if(first>last)
                return 0;
            char temp=s[first];
            s[first]=s[last];
            s[last]=temp;
            return fun(first+1,last-1,s);
        }
    public void reverseString(char[] s){
        fun(0,s.length-1,s);
    }
}
