package tesseract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import net.sourceforge.tess4j.*;
/**
 *
 */
public class LoadTesseract {

    private static final Logger log = LoggerFactory.getLogger(LoadTesseract.class);
    public static void process() {
        File image = new File("img/best-by-date.jpg");
        Tesseract tessInst = new Tesseract();
        tessInst.setDatapath("/usr/share/tesseract-ocr/tessdata");
        try {
            String result = tessInst.doOCR(image);
            log.info(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String args[])
    {
        log.info("Started application");
        process();
    }

}
