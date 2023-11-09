package org.example;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;


import java.io.FileInputStream;
import java.io.IOException;

public class Util {
    public static void excelReader(String file) throws IOException {
        HSSFWorkbook excelBook = new HSSFWorkbook(new FileInputStream(file)); //создаем воркбук и указываем путь к читаемому файлу
        HSSFSheet excelSheet = excelBook.getSheet("1"); // получаем доступ к листу Excel


        HSSFRow row = excelSheet.getRow(0); // выбираем столбец


        /**String name = row.getCell(0).getStringCellValue();
        System.out.println(name);*/

        if(row.getCell(0).getCellType() == CellType.STRING){
            String name = row.getCell(0).getStringCellValue();
            System.out.println(name);
        }
    }
}
