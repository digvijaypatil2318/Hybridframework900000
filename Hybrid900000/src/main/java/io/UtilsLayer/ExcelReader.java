package io.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	FileInputStream fis;
	XSSFWorkbook wb;

	public ExcelReader(String excelpath) {
		File f = new File(excelpath);
		Boolean a = f.exists();
		System.out.println(a);

		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String[][] getData(int sheetIndex) {
		XSSFSheet sheet = wb.getSheetAt(sheetIndex);
		int rows=rowCount(0);
		String[][] data=new String[rows][2];
		
		for (int i = 0; i<rows; i++) {
			data[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
			data[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();
		} 
		
		return data;
	}
	
	public int rowCount(int sheetIndex) {
	int rows=	wb.getSheetAt(sheetIndex).getLastRowNum();
	rows=rows+1;
	return rows;
	}

}
