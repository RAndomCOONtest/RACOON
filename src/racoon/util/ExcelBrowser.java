package racoon.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelBrowser 
{
	
	public ExcelBrowser()
	{
	}
	
	public List<List<String>> getContent(String fileName,String nomOnglet)
	{
		List<List<String>> fileContent = new ArrayList<List<String>>();
		try {
			File file = new File(fileName);
			XSSFWorkbook worbook = new XSSFWorkbook(file);
			XSSFSheet sheet = worbook.getSheet(nomOnglet);
			Iterator<Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext())
			{
				Row row = rowIterator.next();
				Iterator <Cell> cellIterator = row.cellIterator();
				fileContent.add(new ArrayList<String>());
				while (cellIterator.hasNext())
				{
					Cell cell = cellIterator.next();
					fileContent.get(cell.getRowIndex()).add(cell.getStringCellValue());
					
				}
			}
			worbook.close();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileContent;
	}
	
	
}
