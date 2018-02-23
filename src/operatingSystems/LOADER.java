package operatingSystems;

import java.io.*;
import java.lang.*;
import java.math.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;



public class LOADER extends SYSTEM {
 
//ArrayList to store the each line of the input job
	public static ArrayList<String> lines = new ArrayList<String>();
	// ArrayList to store the hexadecimal format of numbers
	public static ArrayList<String> HD = new ArrayList<String>();
	//ArrayList to store the Binary format of numbers
	public static ArrayList<String> BIN = new ArrayList<String>();
	
	LOADER()
	{
		 FileName = "/Users/hmokkap/Desktop/Encryption_hexa.txt";
		 String each_line = null;

	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(FileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((each_line = bufferedReader.readLine()) != null) {
	                //System.out.println(each_line);
	                lines.add(each_line);       
	            }   
	            
	            String first_line = lines.get(0);
	            String[] First_line_values = first_line.split("\\s+");
	            Job_Id = Hex_to_Dec(First_line_values[0]);
	            Base_Address = Hex_to_Dec(First_line_values[1]);
	            PC = Hex_to_Dec(First_line_values[2]);
	            Program_length = Hex_to_Dec(First_line_values[3]);
	            Trace_Flag = Hex_to_Dec(First_line_values[4]);     
	            
	            // Always close files.
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                FileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + FileName + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }
	    }
	
	
	public void HexLoad()
	{
		String one_line="";
		for(int line_index=1;line_index<lines.size();line_index++)
		{
		 one_line=one_line + lines.get(line_index);
		}
		//System.out.println(one_line);
		int each_word=0;
		while(each_word<one_line.length())
		{
			HD.add(one_line.substring(each_word,Math.min(each_word+4,one_line.length())));
			each_word = each_word+4;
		}
		
		for(int i=0;i<HD.size();i++)
		{
			//System.out.println(HD.get(i));
			String first_word = Hex_to_Bin_8_bit(HD.get(i).substring(0, 2));
			String second_word = Hex_to_Bin_8_bit(HD.get(i).substring(2,4));
			//System.out.println(first_word+second_word);
			BIN.add(first_word+second_word);
		}
		
		for(int i=0;i<BIN.size();i++)
		{
			//System.out.println(HD.get(i));
			//System.out.println(BIN.get(i));
		}
	}
	
	LOADER(int X,int Y)
	{
		
	}
		 
	}
	
	

	
	
	
	
	
	

