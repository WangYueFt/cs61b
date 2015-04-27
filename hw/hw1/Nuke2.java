/*Nuke2.java*/
import java.io.*;

/**
  * A class that provdie main function to readin a string and then remove the 
  * second character, finally output it
  */
class Nuke2 {
	public static void main(String[] args) throws Exception {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer string;
		string = new StringBuffer(keyboard.readLine());
		string.deleteCharAt(1);
		System.out.println(string);
	}
}