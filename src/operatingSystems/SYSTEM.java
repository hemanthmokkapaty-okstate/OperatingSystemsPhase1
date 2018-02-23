/*
 * Name:Hemanth Kumar Mokkapaty
 * CWID: A20042630
 * 
 */



package operatingSystems;

import java.io.*;
import java.lang.*;
import java.math.*;
import java.io.BufferedReader;



public class SYSTEM {
	public static int Job_Id;
	public static int Base_Address;
	public static int Start_Instruction;
	public static int Trace_Flag;
	public static int PC;
	public static int Program_length;
	public static int Effective_Address;
	public static String Instruction_Register;
	public static String FileName;
	
	
	public static int Hex_to_Dec(String hex)
	{
		int decimal = Integer.parseInt(hex, 16);
		return decimal;
	}
	
	public static String Hex_to_Bin(String hex)
	{
	int decimal = Integer.parseInt(hex,16);    
	String binary = Integer.toBinaryString(decimal);
	while(binary.length()<16)
	{
		binary = "0"+binary;
	}
	return binary;
	}
	
	public static String Hex_to_Bin_8_bit(String hex)
	{
	int decimal = Integer.parseInt(hex,16);    
	String binary = Integer.toBinaryString(decimal);
	while(binary.length()<8)
	{
		binary = "0"+binary;
	}
	return binary;
	}
	
	public static String Dec_to_Bin_16_bit(int Dec)
	{
		String binary = Integer.toBinaryString(Dec);
		while(binary.length()<16)
		{
			binary = "0"+binary;
		}
		return binary;
		}
	
	
	public static String Dec_to_Bin_8_bit(int Dec)
	{
		String binary = Integer.toBinaryString(Dec);
		while(binary.length()<8)
		{
			binary = "0"+binary;
		}
		return binary;
		}
	
	public static int Bin_to_Dec(String bin)
	{
		int decimalValue = Integer.parseInt(bin, 2);
		return decimalValue;
	}
	
	
	
	

	public static void main(String[] args) {
		LOADER loader = new LOADER();
		// TODO Auto-generated method stub
		loader.HexLoad();
		MEMORY memory = new MEMORY();
		memory.Buffer_Loading(Base_Address,Base_Address);
		CPU cpu = new CPU();
		CPU.CPU(PC,Trace_Flag);
		
		//memory.Memory_print();

	}

	

}
