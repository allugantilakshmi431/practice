package DataDriven;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WritingDataIntoExel {
public static void main(String[] args) throws IOException {
	FileOutputStream file=new FileOutputStream("C:\\Users\\LENOVO\\eclipse-workspace\\practice\\testdata\\myfile.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("data");
	XSSFRow row1=sheet.createRow(0);
	row1.createCell(0).setCellValue("chinni");
	row1.createCell(1).setCellValue(24);
	row1.createCell(2).setCellValue("tester");
	row1.createCell(3).setCellValue("automation");
	XSSFRow row2=sheet.createRow(1);
	row2.createCell(0).setCellValue("nani");
	row2.createCell(1).setCellValue(22);
	row2.createCell(2).setCellValue("froentend developer");
	row2.createCell(3).setCellValue("html css java script");
	XSSFRow row3=sheet.createRow(2);
	row3.createCell(0).setCellValue("rukesh");
	row3.createCell(1).setCellValue(24);
	row3.createCell(2).setCellValue("developer");
	row3.createCell(3).setCellValue("java");
	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("....FILE IS CREATED......");
}
 }

