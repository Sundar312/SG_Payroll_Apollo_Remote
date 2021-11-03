package com.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	XSSFWorkbook WB;
	
	public void ExcelSetup(String Path) throws Exception {
		FileInputStream FIS = new FileInputStream(Path);
	    WB = new XSSFWorkbook(FIS);
	}
	
	public String GetStringCellValue(String sheet, int row, int cell) {
		String CellValue = WB.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return CellValue;
	}
	
	public double GetNumericCellValue(String sheet, int row, int cell) {
		double CellValue = WB.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return CellValue;
	}
	
	public int GetTotalRowNumebers(String sheet) {
		int intialrows = WB.getSheet(sheet).getPhysicalNumberOfRows();
		int actualrows = intialrows - 1;
		return actualrows;
	}
	
	public void WriteMyData(String path, String sheet, int row, int cell, String value) throws Exception {
		FileInputStream FIS = new FileInputStream(path);
		XSSFWorkbook WB2 = new XSSFWorkbook(FIS);
		XSSFSheet Sheet = WB2.getSheet(sheet);
		Sheet.createRow(row).createCell(cell).setCellValue(value);
		FileOutputStream FIO = new FileOutputStream(path);
		WB2.write(FIO);
		WB2.close();
	}
	
	public void CloseDoc() throws IOException {
		WB.close();
	}
	
	
}
