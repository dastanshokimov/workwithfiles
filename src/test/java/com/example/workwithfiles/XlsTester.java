package com.example.workwithfiles;

import com.codeborne.xlstest.XLS;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class XlsTester {
    String xlsFile = "C://Users//dshokimov//IdeaProjects//workwithfiles//src//main//resources//file_example_XLS_50.xls";
    @SneakyThrows
    @Test
    public void canAssertThatXlsContainsText() {
        XLS xls = new XLS(new File(xlsFile));
        assertTrue(xls.excel.getSheetAt(0).getRow(13).getCell(0).toString().equals("13.0"));
        assertTrue(xls.excel.getSheetAt(0).getRow(13).getCell(1).toString().equals("Sherron"));
        assertTrue(xls.excel.getSheetAt(0).getRow(13).getCell(2).toString().equals("Ascencio"));
        assertTrue(xls.excel.getSheetAt(0).getRow(13).getCell(3).toString().equals("Female"));
        assertTrue(xls.excel.getSheetAt(0).getRow(13).getCell(4).toString().equals("Great Britain"));
        assertTrue(xls.excel.getSheetAt(0).getRow(13).getCell(5).toString().equals("32.0"));
        assertTrue(xls.excel.getSheetAt(0).getRow(13).getCell(6).toString().equals("16/08/2016"));
        assertTrue(xls.excel.getSheetAt(0).getRow(13).getCell(7).toString().equals("3256.0"));
    }

    @SneakyThrows
    @Test
    public void canAssertThatXlsHasSpecificNumberOfRows() {
        XLS xls = new XLS(new File(xlsFile));
        assertTrue(xls.excel.getSheetAt(0).getPhysicalNumberOfRows() == 51);
    }
}
