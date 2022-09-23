package com.example.workwithfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZippingService {
    public static void main(String[] args) throws IOException {
        String file1 = "C://Users//dshokimov//IdeaProjects//workwithfiles//src//main//resources//sample.pdf";
        String file2 = "C://Users//dshokimov//IdeaProjects//workwithfiles//src//main//resources//file_example_CSV_5000.csv";
        String file3 = "C://Users//dshokimov//IdeaProjects//workwithfiles//src//main//resources//file_example_XLS_50.xls";

        List<String> srcFiles = Arrays.asList(file1, file2, file3);
        FileOutputStream fos = new FileOutputStream("zipFiles2.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        for (String srcFile : srcFiles) {
            File fileToZip = new File(srcFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();
    }
}
