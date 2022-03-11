import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		String ans="";
		for(int i=0;i<str.length();i++){
			int value=str.charAt(i);
			if(value<=90){
				value+=32;
			}
			else{
				value-=32;
			}
			ans+=(char)value;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
