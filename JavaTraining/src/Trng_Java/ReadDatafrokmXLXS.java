package Trng_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafrokmXLXS {
	//download apache poi jars for reading from excel
	//download https://poi.apache.org/download.html files for running XLS
	//add as external jars under module jars
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("src\\Trng_Java\\course.xlsx");
		try {
			FileInputStream fis=new FileInputStream(f);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheetAt(0);
			for (int r=0;r<=sh.getLastRowNum();r++)
			{
				System.out.println(sh.getRow(r).getCell(0).getStringCellValue()+" " + sh.getRow(r).getCell(1).getStringCellValue());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
