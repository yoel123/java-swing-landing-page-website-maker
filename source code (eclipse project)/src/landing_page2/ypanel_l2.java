package landing_page2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ypanel_l2 extends JPanel implements ActionListener {

    public JLabel ycomp1;
    public JTextField ycomp2;
    public JLabel ycomp3;
    public JTextField ycomp4;
    public JLabel ycomp5;
    public JTextArea ycomp6;
    public JLabel ycomp7;
    public JTextField ycomp8;
    public JTextField ycomp9;
    public JTextField ycomp10;
    public JTextField ycomp11;
    public JTextArea ycomp12;
    public JTextArea ycomp13;
    public JTextArea ycomp14;
    public JTextArea ycomp15;
    public JLabel ycomp16;
    public JTextField ycomp17;
    public JTextField ycomp18;
    public JTextField ycomp19;
    public JTextField ycomp20;
    public JTextField ycomp21;
    public JLabel ycomp22;
    public JLabel ycomp23;
    public JLabel ycomp24;
    public JTextField ycomp25;
    public JTextField ycomp26;
    public JTextField ycomp27;
    public JTextField ycomp28;
    public JTextField ycomp29;
    public JTextField ycomp30;
    public JTextField ycomp31;
    public JTextField ycomp32;
    public JLabel ycomp33;
    public JTextField ycomp34;
    public JLabel ycomp35;
    public JTextField ycomp36;
    public JButton ycomp37;
    public JScrollPane sp;
    
	public ypanel_l2() {
		super();
        setPreferredSize (new Dimension (576, 561));
        setLayout (null);
		create_components();
		add_components();
		position_components();
		
		
	}//end constructor
	
	public void create_components() 
	{
		
	    ycomp1 = new JLabel ("logo img(url)");
        ycomp2 = new JTextField (5);
        ycomp3 = new JLabel ("site title");
        ycomp4 = new JTextField (5);
        ycomp5 = new JLabel ("header pergraph");
        ycomp6 = new JTextArea (5, 5);
        ycomp7 = new JLabel ("featured items");
        ycomp8 = new JTextField (5);
        ycomp9 = new JTextField (5);
        ycomp10 = new JTextField (5);
        ycomp11 = new JTextField (5);
        ycomp12 = new JTextArea (5, 5);
        ycomp13 = new JTextArea (5, 5);
        ycomp14 = new JTextArea (5, 5);
        ycomp15 = new JTextArea (5, 5);
        ycomp16 = new JLabel ("showcase");
        ycomp17 = new JTextField (5);
        ycomp18 = new JTextField (5);
        ycomp19 = new JTextField (5);
        ycomp20 = new JTextField (5);
        ycomp21 = new JTextField (5);
        ycomp22 = new JLabel ("img (url)");
        ycomp23 = new JLabel ("llink text");
        ycomp24 = new JLabel ("link url");
        ycomp25 = new JTextField (5);
        ycomp26 = new JTextField (5);
        ycomp27 = new JTextField (5);
        ycomp28 = new JTextField (5);
        ycomp29 = new JTextField (5);
        ycomp30 = new JTextField (5);
        ycomp31 = new JTextField (5);
        ycomp32 = new JTextField (5);
        ycomp33 = new JLabel ("contact form mail");
        ycomp34 = new JTextField (5);
        ycomp35 = new JLabel ("copyright text");
        ycomp36 = new JTextField (5);
        ycomp37 = new JButton ("genrate landing page");
        //sp = new JScrollPane(ycomp7);

	}//end create_components
	
	public void add_components() 
	{
        add (ycomp1);
        add (ycomp2);
        add (ycomp3);
        add (ycomp4);
        add (ycomp5);
        add (ycomp6);
        add (ycomp7);
        add (ycomp8);
        add (ycomp9);
        add (ycomp10);
        add (ycomp11);
        add (ycomp12);
        add (ycomp13);
        add (ycomp14);
        add (ycomp15);
        add (ycomp16);
        add (ycomp17);
        add (ycomp18);
        add (ycomp19);
        add (ycomp20);
        add (ycomp21);
        add (ycomp22);
        add (ycomp23);
        add (ycomp24);
        add (ycomp25);
        add (ycomp26);
        add (ycomp27);
        add (ycomp28);
        add (ycomp29);
        add (ycomp30);
        add (ycomp31);
        add (ycomp32);
        add (ycomp33);
        add (ycomp34);
        add (ycomp35);
        add (ycomp36);
        add (ycomp37);
        ycomp37.addActionListener(this);
       // add (sp);

        //ycomp10.addActionListener(this);
	}//end add_components
	
	public void position_components() 
	{

        ycomp1.setBounds (95, 25, 100, 25);
        ycomp2.setBounds (265, 25, 100, 25);
        ycomp3.setBounds (95, 60, 100, 25);
        ycomp4.setBounds (265, 60, 100, 25);
        ycomp5.setBounds (95, 95, 100, 25);
        ycomp6.setBounds (265, 95, 100, 75);
        ycomp7.setBounds (265, 180, 100, 25);
        ycomp8.setBounds (45, 220, 100, 25);
        ycomp9.setBounds (165, 220, 100, 25);
        ycomp10.setBounds (285, 220, 100, 25);
        ycomp11.setBounds (395, 220, 100, 25);
        ycomp12.setBounds (45, 255, 100, 75);
        ycomp13.setBounds (165, 255, 100, 75);
        ycomp14.setBounds (285, 255, 100, 75);
        ycomp15.setBounds (395, 255, 100, 75);
        ycomp16.setBounds (230, 335, 100, 25);
        ycomp17.setBounds (210, 355, 100, 25);
        ycomp18.setBounds (100, 385, 100, 25);
        ycomp19.setBounds (215, 385, 100, 25);
        ycomp20.setBounds (330, 385, 100, 25);
        ycomp21.setBounds (445, 385, 100, 25);
        ycomp22.setBounds (5, 385, 100, 25);
        ycomp23.setBounds (5, 420, 100, 25);
        ycomp24.setBounds (5, 450, 100, 25);
        ycomp25.setBounds (100, 420, 100, 25);
        ycomp26.setBounds (215, 420, 100, 25);
        ycomp27.setBounds (330, 420, 100, 25);
        ycomp28.setBounds (445, 420, 100, 25);
        ycomp29.setBounds (100, 450, 100, 25);
        ycomp30.setBounds (215, 450, 100, 25);
        ycomp31.setBounds (330, 450, 100, 25);
        ycomp32.setBounds (445, 450, 100, 25);
        ycomp33.setBounds (70, 490, 120, 25);
        ycomp34.setBounds (195, 490, 100, 25);
        ycomp35.setBounds (65, 525, 100, 25);
        ycomp36.setBounds (195, 525, 100, 25);
        ycomp37.setBounds (375, 510, 175, 30);
	}//end position_components

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton click = (JButton) e.getSource();//get btn clicked var name
		
		//btn Action Listener lesson
		if(click == ycomp37) 
		{
			actions_l2.save_to_file(this);	
		}
		
		
	}//end actionPerformed
	

}
