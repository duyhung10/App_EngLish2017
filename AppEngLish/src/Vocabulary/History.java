package Vocabulary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class History {
    private final String XFileHistory = "C:\\Users\\leduy\\NetBeansProjects\\AppEngLish\\History.xls";
    
    public History() throws IOException{
        File file = new File(XFileHistory);
        if(!file.exists()){
            file.createNewFile();
        }
    }
    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
    // Phương thức kiểm tra từ đã tồn tại trong File chưa (có rồi thì đưa ra true)
    public boolean checkWord(Word word) throws FileNotFoundException, IOException{
        HSSFWorkbook wb;
        HSSFSheet wSheet;
        FileInputStream fis = new FileInputStream(XFileHistory);

        if(fis.available() >= 512){
            wb = new HSSFWorkbook(fis);
            wSheet = wb.getSheetAt(0);
        }else{
            wb = new HSSFWorkbook();
            wSheet = wb.createSheet("History");
        }
        int rowIndex = 0;
        HSSFRow row;
     
        while(true){
            row = wSheet.getRow(rowIndex);
            if(row != null){
                Cell keyword = row.getCell(0);
                String keywordVal = keyword.getStringCellValue();
                if(keywordVal.equals(word.Keyword)){
                    return true;
                }
                rowIndex ++;
            }else
                break;
        }
        fis.close();
        return false;
    }
    
    // Phương thức lưu 1 Word vào file History
    public void saveHistory(Word word) throws FileNotFoundException, IOException{

        HSSFWorkbook wb;
        HSSFSheet wSheet;
        FileInputStream fis = new FileInputStream(XFileHistory);

        if(fis.available() >= 512){
            wb = new HSSFWorkbook(fis);
            wSheet = wb.getSheetAt(0);
        }else{
            wb = new HSSFWorkbook();
            wSheet = wb.createSheet("History");
        }

        int rowIndex = 0;
        HSSFRow row;
        while(true){
            row = wSheet.getRow(rowIndex);
            if(row == null) break;

            Cell cell = row.getCell(0);
            if(cell == null)
                break;

            rowIndex++;
        }

        row = wSheet.createRow(rowIndex);

        Cell keywordCell = row.createCell(0);
        keywordCell.setCellValue(word.Keyword);

        Cell meaningCell = row.createCell(1);
        meaningCell.setCellValue(word.Meaning);

        Cell category = row.createCell(2);
        category.setCellValue(word.Category);

        fis.close();
        FileOutputStream fos = new FileOutputStream(new File(XFileHistory));
        wb.write(fos);
        fos.close();
    }
    // Phương thức đưa ra các từ trong file History
    public ArrayList getAllWords() throws FileNotFoundException, IOException{
        
        ArrayList res = new ArrayList();
        HSSFWorkbook wb;
        HSSFSheet worksheet;
        FileInputStream fIps = new FileInputStream(XFileHistory);

        if(fIps.available() >= 512){
            wb = new HSSFWorkbook(fIps);
            worksheet = wb.getSheetAt(0);
        }else{
            wb = new HSSFWorkbook();
            worksheet = wb.createSheet("History");
        }
        
        int rowIndex = 0;
        HSSFRow row;
        while(rowIndex <= worksheet.getLastRowNum()){
            row = worksheet.getRow(rowIndex);
            
            if(row != null){
                Cell keyword = row.getCell(0);
                Cell meaning = row.getCell(1);
                Cell category = row.getCell(2);
                
                Word word = new Word(keyword.getStringCellValue(), meaning.getStringCellValue(), category.getStringCellValue());
                res.add(word);
                rowIndex++;
            }else
                rowIndex++;
        }
        fIps.close();
        return res;
    }
}
