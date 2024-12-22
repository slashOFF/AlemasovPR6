package org.example;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try
        {
            File file = new File("C:/Users/sobakaSUNRIZE/Desktop/radmir.pdf");
            PDFTextStripper stripper = new PDFTextStripper();
            PDDocument dock = PDDocument.load(file);
            String text = stripper.getText(dock);
            dock.close();
            System.out.println(text);
        }

        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
}