import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Database1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Training\\JavaSelenium\\snapdealapp\\ExcelData\\data1.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet();
		
		s.createRow(0);
		s.getRow(0).createCell(0).setCellValue("Hello");
		s.getRow(0).createCell(1).setCellValue("capg");
		
		s.createRow(1);
		s.getRow(1).createCell(0).setCellValue(true);
		s.getRow(1).createCell(0).setCellValue(1234);
		
		Sheet s1=w.createSheet("Testing data");
		s1.createRow(0);
		s1.getRow(0).createCell(0).setCellValue("Shruti");
		s1.getRow(0).createCell(1).setCellValue("Gauri");
		
		
		w.write(fos);
		w.close();

	}

}
