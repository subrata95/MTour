package org.commonlib;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;
@Test
public class PDFReader {
	public String readPDF() throws IOException {
	ConfigFileReader CFR = new ConfigFileReader();
	URL url=new URL(CFR.getPDFurl());
    InputStream is=url.openStream();
    BufferedInputStream fileparse=new  BufferedInputStream(is);
    PDDocument document = null;
    document=PDDocument.load(fileparse);
    String pdfcontent=new PDFTextStripper().getText(document);
    System.out.println(pdfcontent); 
    return pdfcontent;
}
}