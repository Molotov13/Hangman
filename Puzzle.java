import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle{
	private String word = "INTERNATIONALE";
	private String rem = word;
	private String exp = "______________";
	private int remLen = word.length();
   	public boolean isUnsolved(){
   		return remLen > 0;
   	}
   	public boolean makeGuess(String guess){

		System.out.println(guess);
   		if(rem.indexOf(guess) != -1){
   			while(rem.indexOf(guess) != -1){
   				remLen -= 1;
   				exp = exp.substring(0,rem.indexOf(guess)) + guess + exp.substring(1 + rem.indexOf(guess));
   				rem = rem.substring(0,rem.indexOf(guess)) + "*" + rem.substring(1 + rem.indexOf(guess));
   			}
   			return true;
   		}
   		else return false;
	}
	public void show(){
		System.out.println(exp);
		//for(int i = 0 ; i < exp.length() ; i ++){
		//	System.out.print(exp.substring(i,i+1) + " ");
		//}
   	}
   	public String getWord(){
   		return word;
   	}
}
