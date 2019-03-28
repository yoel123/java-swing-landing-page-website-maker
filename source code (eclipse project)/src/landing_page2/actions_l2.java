package landing_page2;

import java.io.File;
import java.nio.file.Files;

import helpers.html_maker;
import helpers.swing_helper;
import helpers.yio;

public class actions_l2 {

	public static void save_to_file(ypanel_l2 panel) 
	{
		String email = panel.ycomp34.getText();
		//header elements
		String title = html_maker.h("1",panel.ycomp4.getText());
		String logo_img = html_maker.img(panel.ycomp2.getText()) ;
		String top_txt = html_maker.p(panel.ycomp6.getText());
		
		//features elements
		String item1 = make_itemf(panel.ycomp8.getText(),panel.ycomp12	.getText());
		String item2 = make_itemf(panel.ycomp9.getText(),panel.ycomp13.getText());
		String item3 = make_itemf(panel.ycomp10.getText(),panel.ycomp14.getText());
		String item4 = make_itemf(panel.ycomp11.getText(),panel.ycomp15.getText());
		
		//showcase elements
		String stitle = html_maker.h("2",panel.ycomp17.getText());
		
		String showcasei1 = make_items(panel.ycomp18.getText(),panel.ycomp25.getText(),panel.ycomp29.getText());
		String showcasei2 = make_items(panel.ycomp19.getText(),panel.ycomp26.getText(),panel.ycomp30.getText());
		String showcasei3 = make_items(panel.ycomp20.getText(),panel.ycomp27.getText(),panel.ycomp31.getText());
		String showcasei4 = make_items(panel.ycomp21.getText(),panel.ycomp28.getText(),panel.ycomp32.getText());
		
		String copyright = panel.ycomp36.getText();
		
		String form_head = html_maker.formspree_head(email);
		
		//base dir
		String base_dir = "templates\\landing2\\";
		//header
		String header_code = yio.read(base_dir+"header.txt");
		//change header title
		header_code = header_code.replace("materializecss example", panel.ycomp4.getText());
		//body
		String main_code = "<!--///header-->\r\n" + 
				"<div class=\"row header grey darken-4 white-text\"><div class=\"col l12 center\">"
				+ logo_img+title+top_txt
				+ "</div>\r\n" + 
				"</div>\r\n" + 
				"<!--///////end header-->\r\n" + 
				"<!--//features-->"
				+ "<div class=\"row features\">"
				+ item1+item2+item3+item4
				+ "</div>\r\n" + 
				"<!--///////end features-->\r\n" + 
				"<!--/////showcase-->"
				+ "<div class=\"row showcase\">"
				+ "  <div class=\"col l12 center\">"
				+ stitle+"</div>"
				+ showcasei1+showcasei2+showcasei3+showcasei4
				+ "</div>\r\n" + 
				"<!--//////////end showcase-->\r\n" + 
				"<!--////footer-->"
				+ "<div class=\"row footer\">\r\n" + 
				"  <div class=\"col l7 center push-l3\">"
				+ "<h2>contact form</h2>"
				+ form_head
				+ ""
				+ "      <div class=\"row\">\r\n" + 
				"        <div class=\"input-field\">\r\n" + 
				"          <input name=\"cname\" type=\"text\">\r\n" + 
				"          <label for=\"first_name\">name</label>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"row\">\r\n" + 
				"        <div class=\"input-field\">\r\n" + 
				"          <input name=\"cmaill\" type=\"text\">\r\n" + 
				"          <label for=\"first_name\">email</label>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"row\">\r\n" + 
				"        <div class=\"input-field\">\r\n" + 
				"          <textarea id=\"textarea1\" class=\"materialize-textarea\"></textarea>\r\n" + 
				"          <label for=\"textarea1\">content</label>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"row\">\r\n" + 
				"        <div class=\"input-field\"></div>\r\n" + 
				"        <input name=\"cname\" type=\"submit\" class=\"waves-effect waves-light btn\">\r\n" + 
				"      </div>"
				+ "    </form>\r\n" + 
				"    <!--end contact form     -->"
				+ "  <div class=\"col l12 copyright center\"><span class=\"gray lighten-1\">"+copyright+"</span></div>\r\n" + 
				"</div>\r\n" + 
				"<!--////////end footer-->";
		//footer
		String footer_code = yio.read(base_dir+"footer.txt");
		//hole page
		String all_html = header_code+main_code+footer_code;
		//css file
		String css_code = yio.read(base_dir+"css.txt");
		
		//user select file
		File f = swing_helper.choose_dir("select file");
		System.out.println(f.getAbsolutePath());
		//get save path
		String save_to = f.getAbsolutePath();//+"\\landing1";
		
		//create index.html
		yio.write(save_to+"\\index.html" ,all_html);
		
		//create css folder and style file
		File dir = new File(save_to+"\\css");
		if (!dir.exists()) dir.mkdirs();
		yio.write(save_to+"\\css\\style.css" ,css_code);
		
		
	}//end save_to_file
	
	public static String make_itemf(String title,String tst) 
	{
		return "  <div class=\"col l3 item\">\r\n" + 
				"    <h3>"+title+"</h3>\r\n" + 
				"    <p>"+tst+"</p>\r\n" + 
				"  </div>\r\n" + 
				"  <!--end item-->";
	}//end make_itemf
	
	public static String make_items(String img,String link_txt,String link_url) 
	{
		return"  <div class=\"col l3 item\">\r\n" + 
				"    <div class=\"inner card-panel grey lighten-5 z-depth-1\"><img src=\""+img+"\" class=\"responsive-img\">\r\n" + 
				"      <p> <a href=\""+link_url+"\">"+link_txt+"</a></p>\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"  <!--end item-->";
	}//end make_items
}
