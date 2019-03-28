package landing_page1;

import java.io.File;
import java.nio.file.Files;

import helpers.swing_helper;
import helpers.yio;

public class actions_l1 {

	public static void save_to_file(ypanel_l1 panel) 
	{
		String title = "<h1>"+ panel.ycomp3.getText()+"</h1>";
		String img_code = "<img src=\""+panel.ycomp5.getText()+"\" class=\"responsive-img\" />";
		String copy_txt = "<p>"+panel.ycomp7.getText()+"</p>";
		String email = panel.ycomp9.getText();
		
		String form_head="  <form action=\"https://formspree.io/"+
				email+"\" method=\"post\" class=\"contact_form\">";
		String base_dir = "templates\\landing1\\";
		//header
		String header_code = yio.read(base_dir+"header.txt");
		//change header title
		header_code = header_code.replace("materializecss example", panel.ycomp3.getText());
		//body
		String main_code = title+img_code+copy_txt
				+ "<h3>contact us</h3><!--contact form-->"+form_head;
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
}
