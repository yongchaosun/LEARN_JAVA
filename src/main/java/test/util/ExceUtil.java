package test.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceUtil {
    //传一个文件路径、文件名、Excelsheet名字
    public static Object[][] getTestData(String filePath,String fileName,String sheetName) throws IOException {
       //new个File 指定文件路径
        File file = new File(filePath+"/"+fileName);
       //打印输出
        System.out.println(file.getAbsolutePath());
        //构建输入流
        FileInputStream inputStream = new FileInputStream(file);
        //POI提供的一个类
        Workbook workbook = null;
        //判断是否以 .xlsx ，  .xls结尾
        if(fileName.endsWith(".xlsx")){
            workbook = new XSSFWorkbook(inputStream);
        }else if(fileName.endsWith(".xls")){
            workbook = new HSSFWorkbook(inputStream);
        }
        //从Excel表格中获取sheet名字
        Sheet sheet = workbook.getSheet(sheetName);
        //获取一共有多少行，  getLastRowNum 获取最后一行的行号，getFirstRowNum获取第一行的行号
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        System.out.println(rowCount);
        //获取列有多少行
        int colCount = sheet.getRow(0).getLastCellNum();
        //构建二维数组         //构建二维数组
        Object[][] result = new Object[rowCount][];
       // i=1 第一行为表头
         for(int i=1;i<=rowCount;i++){
            Row row = sheet.getRow(i);
            //获取行  getLastCellNum获取最后一行单元格行号
            String[] field = new String[row.getLastCellNum()];
            for(int j=0;j<field.length;j++){
                //行 得到单元格
                Cell cell = row.getCell(j);
               //如果单元格不为空则
                if(cell!=null){
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    field[j] = cell.getStringCellValue();
                }else{
                    //如果单元格为空就等于NULL
                    field[j] = null;
                }
            }
            result[i-1]=field;
        }
        return result;
    }

}
