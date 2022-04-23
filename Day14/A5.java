package Day14;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A5 {

	public static void main(String[] args) {
				
			
				try {
					int i;
					FileReader fr = new FileReader("D:new filefrom.txt");
					
					while((i=fr.read())!=-1) {
						System.out.print((char)i);
						
					}
					fr.close();
					
				} 
				 catch (IOException e) {
					 System.out.println(e);
					
					e.printStackTrace();
	
	}

	}
}
