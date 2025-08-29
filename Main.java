package demo;

import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader r =new BufferedReader(new InputStreamReader(System.in));
	   String str;
	   str = r.readLine();
		try {
			str = r.readLine();
			if(str.equals("aditya")) {
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("This is hard",str);
		
	}

}
