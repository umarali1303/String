public class Main
{
	public static void main(String[] args) {
	    
	    String s="my name is mohd umar ali";
	    String[] st=s.split("\\s");
	    for(int i=0;i<st.length;i++){
	        String s1=st[i];
	        char ch=s1.charAt(0);
	        ch=(char)((int)ch-32);
	        String s2=s1.substring(1);
	        s2=ch+s2+"";
	        st[i]=s2;
	    }
	    for(int i=0;i<st.length;i++)
		System.out.println(st[i]);
	}
}
