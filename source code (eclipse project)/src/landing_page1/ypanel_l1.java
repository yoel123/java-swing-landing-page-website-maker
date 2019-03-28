package landing_page1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ypanel_l1 extends JPanel implements ActionListener {
    public JLabel ycomp1;
    public JLabel ycomp2;
    public JTextField ycomp3;
    public JLabel ycomp4;
    public JTextField ycomp5;
    public JLabel ycomp6;
    public JTextArea ycomp7;
    public JLabel ycomp8;
    public JTextField ycomp9;
    public JButton ycomp10;
    
    public JScrollPane sp;
    
	public ypanel_l1() {
		super();
        setPreferredSize (new Dimension (667, 442));
        setLayout (null);
		create_components();
		add_components();
		position_components();
		
		
	}//end constructor
	
	public void create_components() 
	{
		
        ycomp1 = new JLabel ("landing page maker");
        ycomp2 = new JLabel ("page title");
        ycomp3 = new JTextField (5);
        ycomp4 = new JLabel ("top img (url)");
        ycomp5 = new JTextField (5);
        ycomp6 = new JLabel ("main text");
        ycomp7 = new JTextArea (5, 5);
        sp = new JScrollPane(ycomp7);
        ycomp8 = new JLabel ("contact form email");
        ycomp9 = new JTextField (5);
        ycomp10 = new JButton ("genrate html css");
	}//end create_components
	
	public void add_components() 
	{
        add (ycomp1);
        add (ycomp2);
        add (ycomp3);
        add (ycomp4);
        add (ycomp5);
        add (ycomp6);
        add (sp);
        add (ycomp8);
        add (ycomp9);
        add (ycomp10);
        ycomp10.addActionListener(this);
	}//end add_components
	
	public void position_components() 
	{
        ycomp1.setBounds (240, 10, 165, 35);
        ycomp2.setBounds (70, 50, 100, 25);
        ycomp3.setBounds (170, 50, 130, 25);
        ycomp4.setBounds (70, 85, 100, 25);
        ycomp5.setBounds (170, 85, 135, 25);
        ycomp6.setBounds (70, 120, 100, 25);
        sp.setBounds (170, 125, 410, 120);
        ycomp8.setBounds (70, 260, 135, 25);
        ycomp9.setBounds (195, 260, 175, 25);
        ycomp10.setBounds (240, 310, 160, 25);

	}//end position_components

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton click = (JButton) e.getSource();//get btn clicked var name
		
		//btn Action Listener lesson
		if(click == ycomp10) 
		{
			actions_l1.save_to_file(this);	
		}
		
		
	}//end actionPerformed
	

}
