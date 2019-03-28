package landing_page2;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class yframe_l2 extends JFrame {
	
	
	
	public yframe_l2(String title) throws HeadlessException 
	{
		super(title);
		//setSize( w,h);
		
		add(new ypanel_l2());
		pack();
		    
	}//end constructor
	
	public void yshow() 
	{
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//show window
		setVisible( true );
	}//end init

}
