package com.example.workwithfiles;

import com.codeborne.pdftest.PDF;
import io.qameta.allure.Step;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import static com.codeborne.pdftest.assertj.Assertions.assertThat;

public class PdfTester {
    String pdfFile = "C://Users//dshokimov//IdeaProjects//workwithfiles//src//main//resources//sample.pdf";

    @SneakyThrows
    @Test
    @Step("Negative")
    public void canAssertThatPdfContainsText() {
        PDF pdf = new PDF(new File(pdfFile));
        assertThat(pdf.text).containsAnyOf("Johny");
    }

    @SneakyThrows
    @Test
    @Step("Negative")
    public void canAssertThatPdfHasPagination() {
        PDF pdf = new PDF(new File(pdfFile));
        assertThat(pdf.numberOfPages).isLessThan(1);
    }
}
