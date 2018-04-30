package com.merkconnectUIautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcelUtils 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public TestExcelUtils(String excelPath)
	{
		try {
		File src = new File(excelPath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);		
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int getNoOfRow (int sheetno)
	{
		int row_no = wb.getSheetAt(sheetno).getLastRowNum();
		int row = row_no + 1;
		return row;
	
	}	
	
	public int getNoOfColumns (int sheetno)
	{
		int cell_no = wb.getSheetAt(sheetno).getRow(0).getLastCellNum();
		return cell_no;
	
	}
	
	public void getData(int sheetno, int row, int col)
	{
		sheet= wb.getSheetAt(sheetno);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		//return data ;
		
	}
	
}

