package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 class ExcelInputPage {
	public void excleInput(int Rowvalue ,int cellvalue ) throws Throwable, Throwable {
		FileInputStream fis = new FileInputStream("\\Data_source\\Actitimecredentials.xlsx");
		double  mobileNO =WorkbookFactory.create(fis).getSheet("ActitimeCredention").getRow(Rowvalue).getCell(cellvalue).getNumericCellValue();
		

}
}