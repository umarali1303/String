import java.io.*;
import java.util.*;

public class Main {

	public static boolean pal(String str){
		int start=0;
		int end=str.length()-1;
		while(start<end){
			if(str.charAt(start)!=str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void solution(String str){
		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length();j++){
				if(pal(str.substring(i,j+1))){
					System.out.println(str.substring(i,j+1));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
