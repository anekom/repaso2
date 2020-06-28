package ufv.dis.final2020repaso.repaso2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

public class generadorEAN {
	
	public static void generador() {
		
		EAN13Writer ean13writer = new EAN13Writer();
		BitMatrix bitMatrix;
		try {
			
			bitMatrix = ean13writer.encode("978020137962", BarcodeFormat.EAN_13, 300, 100);
			Path path = FileSystems.getDefault().getPath("imagen.png");
			MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
		
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
