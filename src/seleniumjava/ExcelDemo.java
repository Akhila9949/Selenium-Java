package seleniumjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		String filepath="C:\\Users\\Akhila\\Downloads\\ExcelDemo.xlsx";
		try(XSSFWorkbook workbook=new XSSFWorkbook()){
			
			XSSFSheet sheet1=workbook.createSheet("LoginData");
			sheet1.createRow(0).createCell(0).setCellValue("Username");
			sheet1.createRow(1).createCell(0).setCellValue("Abhiram");
			sheet1.getRow(0).createCell(1).setCellValue("Password");
			sheet1.getRow(1).createCell(1).setCellValue("Ksr@9949");
			FileOutputStream fos=new FileOutputStream(filepath);
			workbook.write(fos);
			
			FileInputStream fis=new FileInputStream(filepath);
			XSSFWorkbook workbook1=new XSSFWorkbook(fis);
			XSSFSheet sheet2=workbook1.getSheet("LoginData");
			String value=sheet2.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Value in Sheet Login Data - "+value);
			
			workbook1.close();
		}
	}

}
