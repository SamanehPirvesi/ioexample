package ioexample;

import java.io.*;

public class IOMain {

	public static void main(String[] args) {
		//File file=new File("test.txt");
		try
		{
			FileWriter fw = new FileWriter("test.txt",true);
			fw.write("second line");
			fw.close();
			FileReader fr=new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);
			 int k;  
	            while ((k = br.read()) != -1) {  
	                System.out.print((char) k);  
	            }  
	            br.close(); 
		}catch
		(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
