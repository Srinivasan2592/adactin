/**
 * 
 */
package org.est;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author admin
 *
 */
public class Excelhandling {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("C:\\Users\\admin\\eclipse-workspace\\Sampletext\\Excel\\sampledatainsurance.xlsx");
		// Load the file.
		FileInputStream sample =new FileInputStream(file);
		
		Workbook book= new XSSFWorkbook(sample);
		Sheet sheet = book.getSheet("PolicyData");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row=sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell=row.getCell(j);
//				String CellValue = cell.getStringCellValue();
//				System.out.println(CellValue);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String CellValue = cell.getStringCellValue();
					System.out.println(CellValue);
				} 
				else if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YY");
				String S = simpleDateFormat.format(dateCellValue);
				System.out.println(S);
				}
				else {
					double n=cell.getNumericCellValue();
					long l=(long) n;
					System.out.println(l);
				}
				}
			}
		}		
}

				
		
		
		

	


