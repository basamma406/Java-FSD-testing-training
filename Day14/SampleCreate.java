package Day14;

import java.io.FileWriter;
import java.io.IOException;
class SampleCreate
{
	public static void main(String[] args)throws IOException
	{
		String st="This is just some sample content"+" for writing into a file ";
		FileWriter f=new FileWriter("D:SampleOutputWriter.txt");
		for(int i=0;i<st.length();i++)
		{
			f.write(st.charAt(0));
		}
		System.out.println("Finished writing");
		f.close();
	}
}