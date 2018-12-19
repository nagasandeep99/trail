package org.DDT;

import java.io.IOException;
import java.util.Hashtable;
import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Exceldata {
	static Workbook wrkbook=null;
	static Sheet sheet=null;
	static Hashtable dict=new Hashtable();
	public Exceldata(String path) throws BiffException,IOException{
		
		wrkbook=Workbook.getWorkbook(new File(path));
		sheet=wrkbook.getSheet("Sheet1");
		
	}
	//Return number of Rows
	public static int Rows(){
		return sheet.getRows();
		
	}
	//create column dictionary to hold all column values	
		public static void columndictionary(){
			//returns through columns in excell sheet and storing in hash table
			for (int col=0;col<sheet.getColumns();col++){
				dict.put(ReadCell(col,0),col);
			}
		}
		//Returns the cell value by taking row and column as refrence
		private static String  ReadCell(int col,int row) {
			
			return sheet.getCell(col, row).getContents();
		}
		
		//Read column names
		
		public static int Getcell(String colName){
			try{
				int value;
				 value=((Integer) dict.get(colName)).intValue();
				return value;
			}
			catch (NullPointerException e) {
				return(0);
			}
	
		}
}
