package ddt;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class readdatafrompdf {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
    File file = new File("./src/main/resources/multipage-pdf.pdf");
    PDDocument doc = PDDocument.load(file);
    //getnoofpages
   // int totalpage = doc.getNumberOfPages();
   // System.out.println(totalpage);
    //get text of pdf 
    PDFTextStripper pdf=new PDFTextStripper();
    pdf.setStartPage(3);
    //pdf.setEndPage(3);
    String text = pdf.getText(doc);
    System.out.println(text);
	}

}
