package com.testProject;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadExcel {
    public static void main(String[] args) {
for (int i = 5; i < 33; i++) {
    ReadCellData(i);
}

    }

    public  static void ReadCellData(int vRow) {
        Workbook wb = null; 
        XSSFWorkbook workbook = null;
        XSSFSheet sheetW = null;
        try {
            workbook = new XSSFWorkbook(new FileInputStream("/Users/sachinyadav/Desktop/1_N.xlsx"));
            sheetW = workbook.getSheet("main sheet");
            wb = new XSSFWorkbook( new FileInputStream("/Users/sachinyadav/Desktop/class9.xlsx") );
        } catch (Exception e) { e.printStackTrace(); }

        Sheet sheet = wb.getSheetAt(0); // getting the XSSFSheet object at given index
        Row row = sheet.getRow(vRow); // returns the logical row
       
         System.out.println(" "+ row.getCell(2).getStringCellValue()+ " H T :"+ row.getCell(7).getNumericCellValue() + " E: " + row.getCell(13).getNumericCellValue() + 
         " M: "   + row.getCell(19).getNumericCellValue() + 
         " S :"+ row.getCell(25).getNumericCellValue() +
          " SS :" + row.getCell(31).getNumericCellValue() );
   
          String name = row.getCell(2).getStringCellValue();

           //Name
           Row nameRow = sheetW.getRow(3);
           nameRow.getCell(2).setCellValue(row.getCell(2).getStringCellValue());
           
           Row hindi = sheetW.getRow(11);

           hindi.getCell(1).setCellValue( row.getCell(3).getNumericCellValue() );   // pero
           hindi.getCell(3).setCellValue( row.getCell(4).getNumericCellValue() );   // noteB
           hindi.getCell(4).setCellValue( row.getCell(5).getNumericCellValue() );   // sub
           hindi.getCell(5).setCellValue( row.getCell(6).getNumericCellValue() );   //annual
           

           Row english = sheetW.getRow(12);

           english.getCell(1).setCellValue( row.getCell(9).getNumericCellValue() );   // pero
           english.getCell(3).setCellValue( row.getCell(10).getNumericCellValue() );   // noteB
           english.getCell(4).setCellValue( row.getCell(11).getNumericCellValue() );   // sub
           english.getCell(5).setCellValue( row.getCell(12).getNumericCellValue() );   //annual
           
           Row pat = sheetW.getRow(13);

           pat.getCell(1).setCellValue( row.getCell(33).getNumericCellValue() );   // pero
           pat.getCell(4).setCellValue( row.getCell(34).getNumericCellValue() );   // SUB
           pat.getCell(5).setCellValue( row.getCell(35).getNumericCellValue() );   //annual
           
           Row math = sheetW.getRow(14);

           math.getCell(1).setCellValue( row.getCell(15).getNumericCellValue() );   // pero
           math.getCell(3).setCellValue( row.getCell(16).getNumericCellValue() );   // noteB
           math.getCell(4).setCellValue( row.getCell(17).getNumericCellValue() );   // sub
           math.getCell(5).setCellValue( row.getCell(18).getNumericCellValue() );   //annual
           
           Row science = sheetW.getRow(15);

           science.getCell(1).setCellValue( row.getCell(21).getNumericCellValue() );   // pero
           science.getCell(3).setCellValue( row.getCell(22).getNumericCellValue() );   // noteB
           science.getCell(4).setCellValue( row.getCell(23).getNumericCellValue() );   // sub
           science.getCell(5).setCellValue( row.getCell(24).getNumericCellValue() );   //annual
          
           Row social = sheetW.getRow(16);

           social.getCell(1).setCellValue( row.getCell(27).getNumericCellValue() );   // pero
           social.getCell(3).setCellValue( row.getCell(28).getNumericCellValue() );   // noteB
           social.getCell(4).setCellValue( row.getCell(29).getNumericCellValue() );   // sub
           social.getCell(5).setCellValue( row.getCell(30).getNumericCellValue() );   //annual

           try {
            
           FileOutputStream fos1 = new FileOutputStream("/Users/sachinyadav/pooja/"+name+".xlsx");
           workbook.write(fos1);
           fos1.close();
           }catch(Exception e ){ e.printStackTrace(); }

    }




}