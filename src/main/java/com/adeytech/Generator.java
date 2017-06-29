package com.adeytech;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;

/**
 * Created by Zelalem on 6/28/2017.
 */
public class Generator
{
    public void generate() {
        try {
            String filename = "C:/NewExcelFile.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("FirstSheet");

            HSSFRow rowhead = sheet.createRow((short)0);
            rowhead.createCell(0).setCellValue("No.");
            rowhead.createCell(1).setCellValue("Name");
            rowhead.createCell(2).setCellValue("Address");
            rowhead.createCell(3).setCellValue("Email");

            HSSFRow row = sheet.createRow((short)1);
            row.createCell(0).setCellValue("1");
            row.createCell(1).setCellValue("My Name");
            row.createCell(2).setCellValue("My Home Address");
            row.createCell(3).setCellValue("my gmail email.");

            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Generated!");

        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }
}
