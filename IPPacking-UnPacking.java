import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MarvellousListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){} 
	public void windowClosed(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}

class PackingActionListener implements ActionListener
{
	public JFrame fobj;
	JButton bobj1;
	JButton bobj2;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	
	public void actionPerformed(ActionEvent e)
	{
		fobj=new JFrame("Packing");
			
		bobj1=new JButton("Pack");
		bobj2=new JButton("Back");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		l1=new JLabel("First number");
		l2=new JLabel("Second number");
		l3=new JLabel("Third number");
		l4=new JLabel("Fourth number");
		
		bobj1.setBounds(40,340,100,30);
		bobj2.setBounds(200,420,100,30);
		
		t1.setBounds(170,80,100,30);
		t2.setBounds(170,140,100,30);
		t3.setBounds(170,200,100,30);
		t4.setBounds(170,260,100,30);
		t5.setBounds(170,340,100,30);
		l1.setBounds(40,80,100,30);
		l2.setBounds(40,140,100,30);
		l3.setBounds(40,200,100,30);
		l4.setBounds(40,260,100,30);
		
		fobj.add(bobj1);
		fobj.add(bobj2);
		
		fobj.add(t1);
		fobj.add(t2);
		fobj.add(t3);		
		fobj.add(t4);		
		fobj.add(t5);		
		fobj.add(l1);
		fobj.add(l2);
		fobj.add(l3);
		fobj.add(l4);
		
		bobj1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource().equals(bobj1))
				{
					int no1=Integer.parseInt(t1.getText());
					int no2=Integer.parseInt(t2.getText());
					int no3=Integer.parseInt(t3.getText());
					int no4=Integer.parseInt(t4.getText());
					
					int ans;
					int i=no1 << 24;
					int j=no2 << 16;
					int k=no3 << 8;
					int l=no4;
					ans=i | j | k | l;
				
					t5.setText(String.valueOf(ans));
				}
			}
		});
		
		bobj2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource().equals(bobj2))
				{
					fobj.setVisible(false);
				}
			}
		});
		fobj.setSize(500,550);
		fobj.setLayout(null);
		fobj.setVisible(true);
	}
}

class UnPackingActionListener implements ActionListener
{
	public JFrame fobj;
	JButton bobj1;
	JButton bobj2;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	
	public void actionPerformed(ActionEvent e)
	{
		fobj=new JFrame("UnPacking");
			
		bobj1=new JButton("UnPack");
		bobj2=new JButton("Back");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		
		l1=new JLabel("First number");
		l2=new JLabel("Second number");
		l3=new JLabel("Third number");
		l4=new JLabel("Fourth number");
		
		bobj1.setBounds(40,80,100,30);
		bobj2.setBounds(200,420,100,30);
		
		t1.setBounds(170,160,100,30);
		t2.setBounds(170,220,100,30);
		t3.setBounds(170,280,100,30);
		t4.setBounds(170,340,100,30);
		t5.setBounds(170,80,100,30);
		l1.setBounds(40,160,100,30);
		l2.setBounds(40,220,100,30);
		l3.setBounds(40,280,100,30);
		l4.setBounds(40,340,100,30);
		
		fobj.add(bobj1);
		fobj.add(bobj2);
		
		fobj.add(t1);
		fobj.add(t2);
		fobj.add(t3);		
		fobj.add(t4);		
		fobj.add(t5);		
		fobj.add(l1);
		fobj.add(l2);
		fobj.add(l3);
		fobj.add(l4);
		
		bobj1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource().equals(bobj1))
				{
					int ans=Integer.parseInt(t5.getText());
				
					int no1,no2,no3,no4;
					no1=ans & 0x000000ff;
					no2=ans >> 8;
					no2=no2 & 0x000000ff;
					no3=ans >> 16;
					no3=no3 & 0x000000ff;
					no4=ans >> 24;
					t1.setText(String.valueOf(no4));				
					t2.setText(String.valueOf(no3));				
					t3.setText(String.valueOf(no2));				
					t4.setText(String.valueOf(no1));
				}					
			}
		});
		bobj2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource().equals(bobj2))
				{
					fobj.setVisible(false);
				}
			}
		});
		fobj.setSize(500,550);
		fobj.setLayout(null);
		fobj.setVisible(true);
	}
}

class FirstWindow 
{
	public JFrame fobj;
	JButton bobj1;
	JButton bobj2;
	public FirstWindow()
	{
		fobj=new JFrame("Packing Unpacking");
		
		bobj1=new JButton("Pack");
		bobj2=new JButton("UnPack");
		
		bobj1.setBounds(100,140,100,30);
		bobj2.setBounds(300,140,100,30);
		
		fobj.add(bobj1);
		fobj.add(bobj2);
		
		bobj1.addActionListener(new PackingActionListener());
		bobj2.addActionListener(new UnPackingActionListener());

		fobj.setSize(500,550);
		fobj.setLayout(null);
		fobj.setVisible(true);
		fobj.addWindowListener(new MarvellousListener());
	}
}

class IPPackUnPack
{
	public static void main(String arg[])
	{
		FirstWindow obj=new FirstWindow();
	}
}
