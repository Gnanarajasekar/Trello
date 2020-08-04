package utilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import utilities.DateConverter;
import word.api.interfaces.IDocument;
import word.w2004.Document2004;
import word.w2004.Document2004.Encoding;
import word.w2004.elements.BreakLine;
import word.w2004.elements.Heading1;
import word.w2004.elements.Heading3;
import word.w2004.elements.Image;
import word.w2004.elements.Paragraph;
import word.w2004.style.HeadingStyle.Align;

public class WordDocument {
 String dateconvert=DateConverter.dateconverter();
 public static void createDoc(String testCaseName,String [] messages,String [] imgFileNames,String path,String name) {
   // Create a document object
 IDocument myDoc = new Document2004();
   myDoc.encoding(Encoding.UTF_8);
   // Inserts one breakline
   myDoc.addEle(BreakLine.times(1).create());
   
   // Specify Test case name as document heading
       myDoc.addEle(Heading1.with(testCaseName + "Scenario").withStyle().align(Align.CENTER).create());
       myDoc.addEle(BreakLine.times(1).create());
     
       myDoc.addEle(BreakLine.times(1).create());
       // Add company name to document footer
       myDoc.getFooter().addEle(
        Heading3.with("Crater").withStyle().align(Align.CENTER).create());
       // Loop through all the image files
       
     
       
       
      for(int i=0;i<imgFileNames.length;i++)
      {
     
     
      myDoc.addEle(Paragraph
               .with(messages[i])
               .create());
     
      myDoc.addEle(BreakLine.times(1).create());
      myDoc.addEle(Image.from_FULL_LOCAL_PATHL(
                       "Screenshots//"+name+"//" + imgFileNames[i] + ".png")
                       .setHeight("350")
                       .setWidth("500")
                       .getContent());
// Insert 2 linebreaks at the end of each inserted image
myDoc.addEle(BreakLine.times(20).create());
     
      }
       
       
       
       
       // Create the word document specifying a location
       String dateconvert=DateConverter.dateconverter();
       File fileObj = new File(path , testCaseName +dateconvert+ ".doc");
       PrintWriter writer = null;
       try {
        writer = new PrintWriter(fileObj);
       } catch (FileNotFoundException e){
        e.printStackTrace();
       }
       
       String myWord = myDoc.getContent();
       writer.println(myWord);
       writer.close();
       // Print a confirmation image to console
       System.out.println("Word document created successfully!");
      }
 
}
