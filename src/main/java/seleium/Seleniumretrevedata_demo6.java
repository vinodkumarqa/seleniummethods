package seleium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.DateFormatter;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Seleniumretrevedata_demo6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./src/main/java/textdata/sheet_nov.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(1).getLastCellNum();
		System.out.println(cells);

		for(int i=1;i<rows;i++) {
			for(int j=0;j<cells;j++) {
				System.out.println(sheet.getRow(i).getCell(j));
				//DateFormatter df=new DateFormatter();
				//System.out.println( df.formatCellValue(sheet.getRow(i).getCell(j)));
			}
		}

	}

}
