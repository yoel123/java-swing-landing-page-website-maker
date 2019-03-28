package helpers;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileSystemView;

public class swing_helper {

	public static void grid_item(JPanel p,double wx,double wy,int gx,int gy,int ancore,Component obj  )
	{
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx = wx;
		gc.weighty = wy;
	
		
		gc.gridx = gx;
		gc.gridy = gy;
		gc.anchor = ancore;
		p.add(obj,gc);
		
	}//end grid item
	
	public static String gi(JPanel p,Component obj,int gx,int gy,GridBagConstraints gc) 
	{
		StringBuilder code = new StringBuilder();
		
		//GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = gx;
		gc.gridy = gy;
		code.append(
				"\n gc.weightx = "+gx+";"
		+"\n gc.weighty = "+gy+";");
		//gc.gridwidth=3;
		//gc.gridheight =2;
		p.add(obj,gc);
		return code.toString();
	}//end gi
	
	
	
	//grid_item(some_panel,1,0.1,0,0,gb.LINE_END,component,gc)

	public DefaultListModel create_defult_list_model(String ... args)//core
	{
		DefaultListModel dl = new DefaultListModel();
		for (String arg : args) 
		{
			dl.addElement(arg);
			//  System.out.println(arg);
		}

		return dl;
	}//end create_defult_list_model string arg

	////////////diologs/////////////
    
	public static void show_message(String title, String message,int type) 
	{
		if(type ==1) 
		{
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
		}
		
		if(type ==2) 
		{
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
			
		}
		
		if(type ==3) 
		{
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
			
		}
		
   }//end show_message
	
   public static void sm(String title, String message,int type)
   {
	   show_message( title, message, type) ;
   }//end sm
   
   public static String input_diolog(String title, String message) {
       String text = null;
       while (text == null || text.trim().equals("")) {
           text = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
       }
       return text;
   }
   
   public static String in_d(String title, String message) 
   {
	   return input_diolog( title,  message);
   }
    
    ////////////end diologs/////////////
	public static DefaultListModel create_defult_list_model(Object ... args)//core
	{
		DefaultListModel dl = new DefaultListModel();
		for (Object arg : args) 
		{
			dl.addElement(arg);
			//  System.out.println(arg);
		}

		return dl;
	}//end create_defult_list_model objects arg

	public static DefaultComboBoxModel create_combo_model(Object ... args)
	{
		DefaultComboBoxModel cm = new DefaultComboBoxModel();
		for (Object arg : args) 
		{
			cm.addElement(arg);
			//  System.out.println(arg);
		}
		return cm;
	}//end DefaultComboBoxModel
	
	public static void lable_add_icon(JPanel p,JLabel l,String img_src) 
	{
		//get and set img to label
		l.setIcon(new ImageIcon(img_src));
		//repaint panel elements etc
		p.repaint();
		p.revalidate(); 
	}//end lable_add_icon
	
	////////file mangers//////////
	public static void save_file(String txt,String ext) 
	{
		JFileChooser save = new JFileChooser();
		int option = save.showSaveDialog(null);
		if (option == JFileChooser.APPROVE_OPTION) //if use clicked save
		{
			try {
				//selected file path
				String file_path = save.getSelectedFile().getPath();
				
				//if no txt extantion add it
				if(!file_path.contains("."+ext)) {file_path +="."+ext;}
	            
				//use BufferedWriter to write all the text to file
				BufferedWriter out = new BufferedWriter(new FileWriter(file_path));
				//write all textarea text to file
				out.write(txt); 
				// close file stream
				out.close(); 
			} catch (Exception ex) { 
				
				System.out.println(ex.getMessage());
			}
			
		}

	}//end save_file
	public static File choose_file(String title) 
	{

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle(title);
		
		int return_value = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (return_value == JFileChooser.APPROVE_OPTION) {
			File selected_file = jfc.getSelectedFile();
			return selected_file;
		}
		return null;
	}//end choose_file
	
	
	public static File choose_file(String title,String file_extension) 
	{

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle(title);
		
		///////create filter/////
		 if (file_extension != null && !file_extension.trim().equals("")) 
		 {
			 
			 FileFilter filter = new FileFilter() {

	                @Override
	                public boolean accept(File pathname) {
	                    return pathname.isDirectory() || pathname.getName().endsWith(file_extension);
	                }

	                @Override
	                public String getDescription() {
	                    return "(" + file_extension + ")";
	                }
	            };

	            jfc.setFileFilter(filter);
			 
		 }
		///////end create filter/////
			
		
		int return_value = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (return_value == JFileChooser.APPROVE_OPTION) {
			File selected_file = jfc.getSelectedFile();
			return selected_file;
		}
		return null;
	}//end choose_file
	
	
	public static File choose_dir(String title) 
	{

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle(title);
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		int return_value = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (return_value == JFileChooser.APPROVE_OPTION) {
			File selected_file = jfc.getSelectedFile();
			return selected_file;
		}
		return null;
	}//end choose_file
	
	////////end file mangers//////////
	
}//end swing helper
