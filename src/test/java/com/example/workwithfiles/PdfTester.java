package com.example.workwithfiles;

import com.codeborne.pdftest.PDF;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import java.io.File;
import static com.codeborne.pdftest.assertj.Assertions.assertThat;

public class PdfTester {
    @SneakyThrows
    @Test
    public void canAssertThatPdfContainsText() {
        PDF pdf = new PDF(new File("C://Users//dshokimov//Downloads//files//sample.pdf"));
        assertThat(pdf.text).containsAnyOf("A Simple PDF File");
    }

    @SneakyThrows
    @Test
    public void canAssertThatPdfHasPagination() {
        PDF pdf = new PDF(new File("C://Users//dshokimov//Downloads//files//sample.pdf"));
        assertThat(pdf.numberOfPages).isGreaterThan(1);
    }
}
