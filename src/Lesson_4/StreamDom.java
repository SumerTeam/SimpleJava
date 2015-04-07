package Lesson_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDom {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-14
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 static void copy(String src, String dest) throws IOException {  
	     InputStream in = null;  
	     OutputStream out = null;  
	     try {  
	         in = new FileInputStream(src);  
	         out = new FileOutputStream(dest);  
	         byte[] buf = new byte[1024];  
	         int n;  
	         while ((n = in.read(buf)) > 0)  
	             out.write(buf, 0, n);  
	     } finally {  
	         if (in != null) in.close();  
	         if (out != null) out.close();
	         /*if (in != null) {  
	             try {  
	                 in.close();  
	             } catch (IOException ex) {  
	                 // There is nothing we can do if close fails  
	             }  
	        if (out != null)  
	             try {  
	                 out.close();  
	             } catch (IOException ex) {  
	                 // There is nothing we can do if close fails  
	             }  
	       }*/
	         //In the note,it is 
	     }  
	}
}
