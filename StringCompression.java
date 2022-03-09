import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		int p1=0;
		String ans="";
		ans+=str.charAt(p1);
		for(int i=0;i<str.length();i++){
			if(str.charAt(p1)!=str.charAt(i)){
				ans+=str.charAt(i);
				p1=i;
			}
		}

		return ans;
	}

	public static String compression2(String str){
		int p1=0;
		String ans="";
		ans+=str.charAt(p1);
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(p1)!=str.charAt(i)){
				if(count>1){
					ans+=count;
				}
				ans+=str.charAt(i);
				count=1;
				p1=i;
			}
			else{
				count++;
			}
		}
		if(count>1){
					ans+=count;
				}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
