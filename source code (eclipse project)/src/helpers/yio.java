package helpers;//change to your package name

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class yio {
	public static String read(String yfilname)
	{
		try 
		{

			String s = 	new String(Files.readAllBytes(Paths.get(yfilname)));
			return s;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "0";

	}//end read



	public static void write(String yfilname,String ywrite)
	{
		BufferedWriter	writer = null;
		try 
		{

			writer = new BufferedWriter( new FileWriter( yfilname));
			writer.write( ywrite);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if ( writer != null)
					writer.close( );
				//S.o("done");
			}
			catch ( Exception e)
			{
				e.printStackTrace();
			}
		}
	}//end write

}
