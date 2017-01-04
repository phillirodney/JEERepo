package services;

import java.io.FileOutputStream;
import java.text.DecimalFormat;

import javax.ejb.Stateless;
import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.*;

@Stateless
public class orderPDFCreate {

	public void makeReport() {
		
		String pdfFileName = "hello";
		createPDF(pdfFileName);
	
		
	}

	
	
	private void createPDF(String pdfFilename){
		
		Document doc = new Document();
		PdfWriter docWriter = null;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		
		try {
		    
			   //special font sizes
			   Font bfBold12 = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0)); 
			   Font bf12 = new Font(FontFamily.TIMES_ROMAN, 12); 
			 
			   //file path
			   String path = pdfFilename;
			   docWriter = PdfWriter.getInstance(doc , new FileOutputStream(path));
			    
			   //document header attributes
			   doc.addAuthor("betterThanZero");
			   doc.addCreationDate();
			   doc.addProducer();
			   doc.addCreator("MySampleCode.com");
			   doc.addTitle("Report with Column Headings");
			   doc.setPageSize(PageSize.LETTER);
			   
			   //open document
			   doc.open();
			 
			   //create a paragraph
			   Paragraph paragraph = new Paragraph("iText ® is a library that allows you to create and " +
			     "manipulate PDF documents. It enables developers looking to enhance web and other " +
			     "applications with dynamic PDF document generation and/or manipulation.");
			   
			   doc.add(paragraph);
			   
		}
		catch (DocumentException dex)
		  {
		   dex.printStackTrace();
		  }
		  catch (Exception ex)
		  {
		   ex.printStackTrace();
		  }
		  finally
		  {
		   if (doc != null){
		    //close the document
		    doc.close();
		   }
		   if (docWriter != null){
		    //close the writer
		    docWriter.close();
		   }
		
		
	}
		
	}
	
}
