package helpers;



public class S
{
	public static void o(Object s)
	{
		System.out.println(s);
	}
	
	public static String table(String[] s,int row_size)
	{
		
		String table_format="",ret="";
		int i =1;//format starts counting from 1
		
		//create table format
		for(String sf :s)
		{
			table_format +="|%"+i+"$-"+row_size+"s";
			i++;
		}//end for
		
		table_format +="|";//close table with this char
		
		//create formated string 
		ret = String.format(table_format,s);
		return ret;
	}//end table
	
	public static String table(String[][] s,int row_size)
	{
		String ret="";
		
		//loop all rows
		for(String[] row :s) 
		{
			ret +=table(row,row_size)+" \n";
		}//end for
		
		return ret;
	}//end table
}