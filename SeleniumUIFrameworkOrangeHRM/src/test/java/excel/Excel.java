package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class Excel {


@Test
public void test() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\moham\\OneDrive\\Documents\\selenium data\\SELENIUM DATA.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("Sheet1");
	
	Row row=sheet.getRow(1);
	Cell cell=row.getCell(1);
	String vacancyname=cell.getStringCellValue();
	System.out.println(vacancyname);
	System.out.println();
	
	for(int i=1;i<4;i++) {
	Row row1=sheet.getRow(i);
	Cell cell1=row1.getCell(1);
	String vacancynames=cell1.getStringCellValue();
	System.out.println(vacancynames);}
	workbook.close();
}
}
	


