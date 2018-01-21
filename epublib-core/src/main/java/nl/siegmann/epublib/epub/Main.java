package nl.siegmann.epublib.epub;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nl.siegmann.epublib.domain.Book;

public class Main {
    public static void main(String[] args) {
        try {
           Book book =  new EpubReader().readEpubLazy(new net.sf.jazzlib.ZipFile("C:\\Users\\Net6.ARATMGDOMAIN\\Desktop\\georgia-pls-ssml.epub"), "utf-8");
           book.getContents();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
