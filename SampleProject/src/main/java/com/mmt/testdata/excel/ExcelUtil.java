package com.mmt.testdata.excel;

import static com.mmt.support.FrameworkConstants.getTestdata;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static HashMap<String, String> readDataFromExcel(String worksheet) {
		
		HashMap<String, String> data = new HashMap<String, String>();
		
		try {
			FileInputStream fs = new FileInputStream(new File(getTestdata()));
			XSSFWorkbook workkbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workkbook.getSheet(worksheet);
			
			Row header = sheet.getRow(0);
			Row currentRow = sheet.getRow(1); //currently fetching only the first row
			
			for(int i=0;i<header.getPhysicalNumberOfCells();i++) {
				data.put(header.getCell(i).getStringCellValue(), currentRow.getCell(i).getStringCellValue());
			}
			workkbook.close();
			fs.close();
		}
		catch(Exception e) {}	
		return data;
	}
}
