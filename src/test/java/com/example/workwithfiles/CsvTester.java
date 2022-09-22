package com.example.workwithfiles;
import com.opencsv.CSVReader;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.FileReader;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;


public class CsvTester {
    @SneakyThrows
    @Test
    public void canAssertThatCsvContainsStrings(){
        CSVReader tester =  new CSVReader(new FileReader("C://Users//dshokimov//Downloads//files//file_example_CSV_5000.csv"));
        assertThat(tester).asString().contains("Mara");
    }
}
