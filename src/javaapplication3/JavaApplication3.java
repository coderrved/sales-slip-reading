/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package javaapplication3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import static javaapplication3.Dialog.getSelectedImage;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
*/
/**
 *
 * @author HP
 */

/*
public class JavaApplication3 {
    
    public static String degisken = "";
    public static boolean tarihKontrol = false;
    public static boolean fisKontrol = false;
    public static boolean toplamKontrol = false;
    public static boolean kdvKontrol = false;

    public static ArrayList<String> tessOpenCv(){
		
		System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
		//"C:\\Users\\HP\\Desktop\\fis304.jpg"
		Mat img = new Mat();		
		img = Imgcodecs.imread(getSelectedImage);               
		Imgcodecs.imwrite("C:\\Users\\HP\\Desktop\\imagee.jpg", img);
		
		Mat imgGray = new Mat();
		Imgproc.cvtColor(img, imgGray, Imgproc.COLOR_BGR2GRAY);
		Imgcodecs.imwrite("C:\\Users\\HP\\Desktop\\grayyy.jpg", imgGray);
               

		Mat imgAdaptiveThreshold = new Mat();
		Imgproc.adaptiveThreshold(imgGray, imgAdaptiveThreshold, 300, Imgproc.ADAPTIVE_THRESH_MEAN_C ,Imgproc.THRESH_BINARY, 63, 28);
		Imgcodecs.imwrite("C:\\Users\\HP\\Desktop\\grayyy2.jpg", imgAdaptiveThreshold);
		
		System.out.println("Image Processed");
		
		File imageFile = new File("C:\\Users\\HP\\Desktop\\grayyy2.jpg");
        	ITesseract instance = new Tesseract();
       		instance.setLanguage("tur");
       		//instance.setDatapath("tessdata");
                String saat="",toplam="",topKdv="",fisNo="",tarih="";
                ArrayList<String> arrayList = new ArrayList<>();
        
    try {
        	
            String result = instance.doOCR(imageFile);
            System.out.println(result);
            System.out.println("*********************************");            
            String[] arrOfStr =result.split("\n");
            
            if(arrOfStr[0].startsWith("TESEKK") || arrOfStr[0].startsWith("TEŞEKK") ||
                    arrOfStr[0].startsWith("Tesekk") || arrOfStr[0].startsWith("Teşekk") ||
                    arrOfStr[0].startsWith("HOŞGE") || arrOfStr[0].startsWith("HOSGE") ||
                    arrOfStr[0].startsWith("Hosge") || arrOfStr[0].startsWith("Hoşge"))
            {
                    
            String isletmeAdi = arrOfStr[1].replace("*","");
            System.out.println("ISLETME ADI: " + isletmeAdi);
            arrayList.add(isletmeAdi);
            
            }
            else{
                String isletmeAdi = arrOfStr[0].replace("*","");
                System.out.println("ISLETME ADI: " + isletmeAdi);
                arrayList.add(isletmeAdi);
            }
            String urunler = "";
            for(int i=0 ; i<arrOfStr.length ; i++){
             
            arrOfStr[i]=arrOfStr[i].replace("*", "");
                
            
            String kontrol = arrOfStr[i];
            
            if(kontrol.indexOf("%") != (-1)){
                int location = kontrol.indexOf("%");               
                urunler = urunler + kontrol.substring(0, location);
                System.out.println("URUN: " + urunler);                
            }
            
            
            if(arrOfStr[i].startsWith("SAAT") || arrOfStr[i].startsWith("SRRT")){
                String temizle = arrOfStr[i].replace(" ","");               
                String strNew = temizle.replaceAll("([A-İ-Z])", "");                 
                String strOld = strNew.replaceFirst(":","");               
                System.out.println("SAAT : " + strOld);
                saat = strOld;               
            }
            
            if(arrOfStr[i].startsWith("TARİH") || arrOfStr[i].startsWith("TRRİH") ||
               arrOfStr[i].startsWith("TRRIH") || arrOfStr[i].startsWith("main") ||
               arrOfStr[i].startsWith("TARIH")){
                 String temizle = arrOfStr[i].replace(" ","");               
                 String strNew = temizle.replaceAll("([A-İ-Z])", "");                                
                 String strOld = strNew.replace("'", "");
                 String strOld1 = strOld.replace(":", "");
                 String strOld2 = strOld1.replace("*", "");
                 String strOld3 = strOld2.replace("“", "");
                 System.out.println("TARİH : " + strOld3);
                 tarih = strOld3;
                 tarihKontrol = true;
            }
            
            
            if(arrOfStr[i].startsWith("TOPLAM")){
                String temizle = arrOfStr[i].replace(" ","");
                System.out.println("TOPLAM TEMİZLE: " + temizle);
                String strNew = temizle.replaceAll("([A-İ-Z])", "");
                System.out.println("TOPLAM STRNEW: " + strNew);               
                String strOld = strNew.replace("'", "");
                String strOld1 = strOld.replace(":", "");
                String strOld2 = strOld1.replace("*", ""); 
                String strOld3 = strOld2.replace("—", "");           
                System.out.println("TOPLAM : " + strOld3);
                toplam = strOld3;
                if(kdvKontrol == false)
                {
                String temizle2 = arrOfStr[i].replace(" ","");              
                String strNew3 = temizle2.replaceAll("([A-İ-Z])", "");                             
                String strOld4 = strNew3.replace("'", "");
                String strOld15 = strOld4.replace(":", "");
                String strOld25 = strOld15.replace("*", "");              
                System.out.println("TOPLAM KDV : " + strOld25);
                topKdv = strOld25;
                kdvKontrol =true;
                }
                toplamKontrol = true;
            }
            
            if(arrOfStr[i].startsWith("TOPKDV")){
                String temizle = arrOfStr[i].replace(" ","");              
                String strNew = temizle.replaceAll("([A-İ-Z])", "");                             
                String strOld = strNew.replace("'", "");
                String strOld1 = strOld.replace(":", "");
                String strOld2 = strOld1.replace("*", "");              
                System.out.println("TOPLAM KDV : " + strOld2);
                topKdv = strOld2;
                
                if(toplamKontrol == false)
                {
                 
                String temizle1 = arrOfStr[i+1].replace(" ","");
                System.out.println("TOPLAM TEMİZLE: " + temizle1);
                String strNew2 = temizle1.replaceAll("([A-İ-Z])", "");
                System.out.println("TOPLAM STRNEW: " + strNew2);               
                String strOld3 = strNew2.replace("'", "");
                String strOld12 = strOld3.replace(":", "");
                String strOld22 = strOld12.replace("*", ""); 
                String strOld33 = strOld22.replace("—", "");           
                System.out.println("TOPLAM : " + strOld33);
                toplam = strOld33; 
                toplamKontrol =true;
                }
                
                kdvKontrol = true;
            }
            
            if(arrOfStr[i].startsWith("Fis") || arrOfStr[i].startsWith("Fiş") ||
                    arrOfStr[i].startsWith("FİŞ") || arrOfStr[i].startsWith("FİS") ||
                    arrOfStr[i].startsWith("FIŞ")){                   
                    String kontrol1 = arrOfStr[i];
                    String deneme = kontrol1.replace(" ", "");                  
                    String strNew = deneme.replaceAll("([A-İ-Z])", "");                  
                    String strOld = strNew.replaceAll("([A-Ş-Z])", "");
                    String strr = strOld.replaceAll("([a-ş-z])", "");                   
                    String strMid = strr.replace(":","");
                     String strOld4 = strMid.replace(",", "");
                    System.out.println("FİS NO: " + strOld4);
                    fisNo = strOld4;   
                    fisKontrol = true;                   
            }
            
            String[] parseStr = kontrol.split(" "); 
            
             for(int j=0 ; j<parseStr.length ; j++){
                 degisken = degisken + parseStr[j] + "\n";  
                   
                 if(parseStr[j].startsWith("F'îş") || parseStr[j].startsWith("FîşNo")){                   
                    if(parseStr[j+1].startsWith("0") || parseStr[j+1].startsWith("1") ||
                       parseStr[j+1].startsWith("2") || parseStr[j+1].startsWith("3") ||
                       parseStr[j+1].startsWith("4") || parseStr[j+1].startsWith("5") ||
                       parseStr[j+1].startsWith("6") || parseStr[j+1].startsWith("7") ||
                       parseStr[j+1].startsWith("8") || parseStr[j+1].startsWith("9")){
                        System.out.println("FİS NO: " + parseStr[j+1]); 
                        fisNo = parseStr[j+1];
                        fisKontrol = true;
                        if(tarihKontrol == false)
                        {
                            tarih = parseStr[j-1];
                            System.out.println("TARİH: " + tarih);
                            tarihKontrol = true;
                        }
                    }else if(parseStr[j+2].startsWith("0") || parseStr[j+2].startsWith("1") ||
                            parseStr[j+2].startsWith("2") || parseStr[j+2].startsWith("3") ||
                            parseStr[j+2].startsWith("4") || parseStr[j+2].startsWith("5") ||
                            parseStr[j+2].startsWith("6") || parseStr[j+2].startsWith("7") ||
                            parseStr[j+2].startsWith("8") || parseStr[j+2].startsWith("9")) {
                            System.out.println("FİS NO: " + parseStr[j+2]); 
                            fisNo = parseStr[j+2];
                            fisKontrol = true;
                            if(tarihKontrol == false)
                        {
                            tarih = parseStr[j-1];
                            System.out.println("TARİH: " + tarih);
                            tarihKontrol =true;
                        }
                    }                                     
                }
                 
                if(fisKontrol == false){ 
                 if(parseStr[j].startsWith("Fis") || parseStr[j].startsWith("Fiş") ||
                    parseStr[j].startsWith("FİŞ") || parseStr[j].startsWith("FİS") ||
                    parseStr[j].startsWith("FIŞ"))
                 {
                     if(parseStr[j+1].startsWith("0") || parseStr[j+1].startsWith("1") ||
                       parseStr[j+1].startsWith("2") || parseStr[j+1].startsWith("3") ||
                       parseStr[j+1].startsWith("4") || parseStr[j+1].startsWith("5") ||
                       parseStr[j+1].startsWith("6") || parseStr[j+1].startsWith("7") ||
                       parseStr[j+1].startsWith("8") || parseStr[j+1].startsWith("9")){
                        System.out.println("FİS NO: " + parseStr[j+1]); 
                        fisNo = parseStr[j+1];
                        fisKontrol = true;
                        if(tarihKontrol == false)
                        {
                            tarih = parseStr[j-1];
                            System.out.println("TARİH: " + tarih);
                            tarihKontrol = true;
                        }
                    }else if(parseStr[j+2].startsWith("0") || parseStr[j+2].startsWith("1") ||
                            parseStr[j+2].startsWith("2") || parseStr[j+2].startsWith("3") ||
                            parseStr[j+2].startsWith("4") || parseStr[j+2].startsWith("5") ||
                            parseStr[j+2].startsWith("6") || parseStr[j+2].startsWith("7") ||
                            parseStr[j+2].startsWith("8") || parseStr[j+2].startsWith("9")) {
                            System.out.println("FİS NO: " + parseStr[j+2]); 
                            fisNo = parseStr[j+2];
                            fisKontrol = true;
                            if(tarihKontrol == false)
                        {
                            tarih = parseStr[j-1];
                            System.out.println("TARİH: " + tarih);
                            tarihKontrol =true;
                        }
                     
                     
                 }else if(parseStr[j+3].startsWith("0") || parseStr[j+3].startsWith("1") ||
                            parseStr[j+3].startsWith("2") || parseStr[j+3].startsWith("3") ||
                            parseStr[j+3].startsWith("4") || parseStr[j+3].startsWith("5") ||
                            parseStr[j+3].startsWith("6") || parseStr[j+3].startsWith("7") ||
                            parseStr[j+3].startsWith("8") || parseStr[j+3].startsWith("9")) {
                            System.out.println("FİS NO: " + parseStr[j+3]); 
                            fisNo = parseStr[j+3];
                            fisKontrol = true;
                            if(tarihKontrol == false)
                        {
                            tarih = parseStr[j-1];
                            System.out.println("TARİH: " + tarih);
                            tarihKontrol = true;
                        }
                     
                     
                 }
                }
                }
                 
             }
             
            }
            
            arrayList.add(tarih);
            arrayList.add(fisNo);
            arrayList.add(urunler);
            arrayList.add(saat);
            arrayList.add(topKdv);
            arrayList.add(toplam);
            return arrayList;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return null;
        }
	} 
    
    
    public static void main(String[] args) {
        
            
    }
    
}
*/