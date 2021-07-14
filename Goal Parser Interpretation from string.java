class Solution {
    public String interpret(String command) {
       StringBuffer sb=new StringBuffer();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    sb.append('o');
                    ++i;
                }
                else{
                    sb.append(command.charAt(i+1));
                    ++i;
                }
            }
        else if(command.charAt(i)!=')'){
            sb.append(command.charAt(i));
        }
        }
        return sb.toString();
    }
}
