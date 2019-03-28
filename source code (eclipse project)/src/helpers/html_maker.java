package helpers;

public class html_maker {
	
	public static String img(String src) 
	{
		return"<img src=\""+src+"\" class=\"responsive-img\" />";
	}//end img
	
	public static String p(String txt) 
	{
		return "<p>"+txt+"</p>";
	}//end img
	
	public static String h(String num,String txt) 
	{
		return "<h"+num+">"+txt+"</h"+num+">";
	}//end img
	
	public static String formspree_head(String email) 
	{
		return "  <form action=\"https://formspree.io/"+
				email+"\" method=\"post\" class=\"contact_form\">";
	}//end img
	
	public static String d(String yclass) 
	{
		return "<!--////"+yclass+"--> <div class=\""+yclass+"\"> ";
	}//end div
	
	public static String cd(String comment) 
	{
		return " </div>"
				+ " <!--////end "+comment+"-->";
	}//end close div
	
}
