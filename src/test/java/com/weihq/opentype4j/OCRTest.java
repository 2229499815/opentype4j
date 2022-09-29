package com.weihq.opentype4j;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * @Description TODO
 * @Author 姚仲杰#80998699
 * @Date 2022/9/29 14:33
 */
public class OCRTest {
    
    public static void main(String[] args) throws TesseractException {
        File imageFile=new File("C:\\Users\\86180\\Desktop\\font\\1.jpg");
        ITesseract instance=new Tesseract();
        instance.setDatapath("D:\\tessdata");
        instance.setLanguage("chi_sim");
        String s = instance.doOCR(imageFile);
        System.out.println(s);
    }
}
