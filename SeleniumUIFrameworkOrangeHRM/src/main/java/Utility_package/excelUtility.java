package Utility_package;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class excelUtility {
		Workbook wb;
		Sheet sheet;
		// load excel file
		public void loadExcelFile(String filepath,String sheetName) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(filepath);
			wb=WorkbookFactory.create(fis);
			sheet = wb.getSheet(sheetName);
			
		}
		private String getDataFromSingleCell(int rowNo, int cellNo) throws IOException {
			 String data = sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
			 if(data=="") {
				System.out.println("No data present");
			 }
			 wb.close();
			 return data;
		}
		
		
	public void writeDataInTheCell(String filePath,int rowNo,int cellNo,String data) throws IOException {
		Row row = sheet.getRow(rowNo);
		if(row==null) {
			row=sheet.createRow(rowNo);
	}
		Cell cell = row.getCell(cellNo);
		if(cell==null) {
			cell = row.createCell(cellNo);
		}
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		fos.close();
		
	}
	//Get entire data using data provider
	public Object[][] getDataFromExcelSheet() {

	    int rowNo = sheet.getLastRowNum();
	    int columnNo = sheet.getRow(0).getLastCellNum();

	    Object[][] data = new Object[rowNo][columnNo];

	    for (int i = 1; i <= rowNo; i++) {

	        Row row = sheet.getRow(i);

	        for (int j = 0; j < columnNo; j++) {

	            Cell cell = row.getCell(j);

	            if (cell == null) {
	                data[i - 1][j] = "";
	                continue;
	            }

	            switch (cell.getCellType()) {

	                case STRING:
	                    data[i - 1][j] = cell.getStringCellValue();
	                    break;

	                case NUMERIC:
	                    data[i - 1][j] = String.valueOf((long) cell.getNumericCellValue());
	                    break;

	                case BOOLEAN:
	                    data[i - 1][j] = String.valueOf(cell.getBooleanCellValue());
	                    break;

	                case BLANK:
	                    data[i - 1][j] = "";
	                    break;

	                default:
	                    data[i - 1][j] = "";
	                    break;
	            }
	        }
	    }
	    return data;
	}
	}