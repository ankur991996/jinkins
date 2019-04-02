package org.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read {
	@DataProvider
	public String[][] run() throws Exception {
		String[][] s = null;
		FileInputStream fis = new FileInputStream("C:\\Users\\Ankur Verma\\Desktop\\Read.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		s = new String[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getLastCellNum()];
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				String val = sheet.getRow(i).getCell(j).toString();
				s[i - 1][j] = val;
			}
		}
		return s;
	}

	@Test(dataProvider = "run")
	public void read(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

}
