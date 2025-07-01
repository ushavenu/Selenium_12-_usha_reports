package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author usha
 */
public class ExcelUtility {

	/**
	 * This method is used to read data from excel file in string format
	 * @param sheetname
	 * @param rowIndex
	 * @param columnIndex
	 * @return value in string
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetname,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	return 	wb.getSheet(sheetname).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	}
	
	
	
	/**
	 * This method is used to read data from excel file in Number format
	 * @param sheetname
	 * @param rowIndex
	 * @param columnIndex
	 * @return value in double
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumberDataFromExecel(String sheetname,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	return 	wb.getSheet(sheetname).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();		
    }
	
	
	
	/**
	 * This method is used to read data from excel file in Boolean format
	 * @param sheetname
	 * @param rowIndex
	 * @param columnIndex
	 * @return value in boolean
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExecel(String sheetname,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	return 	wb.getSheet(sheetname).getRow(rowIndex).getCell(columnIndex).getBooleanCellValue();
    }
	
	
	
	
	/**
	 * This method is used to read data from excel file in local date and time format
	 * @param sheetname
	 * @param rowIndex
	 * @param columnIndex
	 * @return  value in LocalDateTime
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getDateAndTimeDataFromExecel(String sheetname,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	return 	wb.getSheet(sheetname).getRow(rowIndex).getCell(columnIndex).getLocalDateTimeCellValue();		
    }
	
}
