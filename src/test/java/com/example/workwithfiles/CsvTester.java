package com.example.workwithfiles;
import com.opencsv.CSVReader;
import io.qameta.allure.Step;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileReader;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;


public class CsvTester {
    String csvFile = "C://Users//dshokimov//IdeaProjects//workwithfiles//src//main//resources//file_example_CSV_5000.csv";
    @SneakyThrows
    @Test
    @Disabled
    @Step("Positive")
    public void canAssertThatCsvContainsStrings(){
        CSVReader tester =  new CSVReader(new FileReader(csvFile));
        assertThat(tester.toString().contains("1"));
        assertThat(tester.toString().contains("Dulce"));
        assertThat(tester.toString().contains("Abril"));
        assertThat(tester.toString().contains("United States"));
        assertThat(tester.toString().contains("32"));
        assertThat(tester.toString().contains("15/10/2017"));
        assertThat(tester.toString().contains("1562"));
    }
}
