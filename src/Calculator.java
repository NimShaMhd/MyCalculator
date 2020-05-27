import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Calculator implements ActionListener {

	boolean isOpertorClicked=false;
	boolean isplus=false;
	boolean isminus=false;
	boolean isdivision=false;
	boolean ismultip=false;
	String oldValue,newValue;
	JFrame jf;
	JLabel display;
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
	JButton buttonplus,buttonminus,buttonequal,buttonmul,buttondiv,buttonpoint,buttonclear;
	int operator;
	
	Calculator(){
		jf=new JFrame("MyCalculator");
		jf.setLayout(null);
		jf.setBackground(Color.black);
		jf.setSize(280,425);
		//jf.setLocation(250, 25);
		
		display=new JLabel();
		display.setBounds(10, 20, 230, 50);//FOR adjusting the display text area position
		display.setBackground(Color.orange);
		display.setOpaque(true);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setForeground(Color.black);
		display.setFont(new Font("Arial",Font.PLAIN,20));
		jf.add(display);
		
		
		
		button1=new JButton("1");
		button1.setBounds(10, 80, 50, 50);
		button1.setFont(new Font("Arial",Font.PLAIN,25));
		button1.addActionListener(this);
		button1.setBackground(Color.black);
		button1.setForeground(Color.orange);
		jf.add(button1);
		
		button4=new JButton("4");
		button4.setBounds(10, 140, 50, 50);
		button4.setFont(new Font("Arial",Font.PLAIN,25));
		button4.addActionListener(this);
		button4.setBackground(Color.black);
		button4.setForeground(Color.orange);
		jf.add(button4);
		
		button7=new JButton("7");
		button7.setBounds(10, 200, 50, 50);
		button7.setFont(new Font("Arial",Font.PLAIN,25));
		button7.addActionListener(this);
		button7.setBackground(Color.black);
		button7.setForeground(Color.orange);
		jf.add(button7);
		
		buttonpoint=new JButton(".");
		buttonpoint.setBounds(10, 261, 50, 50);
		buttonpoint.setFont(new Font("Arial",Font.PLAIN,25));
		buttonpoint.addActionListener(this);
		buttonpoint.setBackground(Color.black);
		buttonpoint.setForeground(Color.orange);
		jf.add(buttonpoint);
		
		button2=new JButton("2");
		button2.setBounds(70, 80, 50, 50);
		button2.setFont(new Font("Arial",Font.PLAIN,25));
		button2.setBackground(Color.black);
		button2.setForeground(Color.orange);
		button2.addActionListener(this);
		jf.add(button2);
		
		button5=new JButton("5");
		button5.setBounds(70, 140, 50, 50);
		button5.setFont(new Font("Arial",Font.PLAIN,25));
		button5.setBackground(Color.black);
		button5.setForeground(Color.orange);
		button5.addActionListener(this);
		jf.add(button5);
		
		button8=new JButton("8");
		button8.setBounds(70,200, 50, 50);
		button8.setFont(new Font("Arial",Font.PLAIN,25));
		button8.setBackground(Color.black);
		button8.setForeground(Color.orange);
		button8.addActionListener(this);
		jf.add(button8);
		
		button0=new JButton("0");
		button0.setBounds(70, 261, 50, 50);
		button0.setFont(new Font("Arial",Font.PLAIN,25));
		button0.setBackground(Color.black);
		button0.setForeground(Color.orange);
		button0.addActionListener(this);
		jf.add(button0);
		
		button3=new JButton("3");
		button3.setBounds(131, 80, 50, 50);
		button3.setFont(new Font("Arial",Font.PLAIN,25));
		button3.setBackground(Color.black);
		button3.setForeground(Color.orange);
		button3.addActionListener(this);
		jf.add(button3);
		
		button6=new JButton("6");
		button6.setBounds(131, 140, 50, 50);
		button6.setFont(new Font("Arial",Font.PLAIN,25));
		button6.setBackground(Color.black);
		button6.setForeground(Color.orange);
		button6.addActionListener(this);
		jf.add(button6);
		
		button9=new JButton("9");
		button9.setBounds(131,200, 50, 50);
		button9.setFont(new Font("Arial",Font.PLAIN,25));
		button9.setBackground(Color.black);
		button9.setForeground(Color.orange);
		button9.addActionListener(this);
		jf.add(button9);
		
		buttonequal=new JButton("=");
		buttonequal.setBounds(131, 261, 50, 50);
		buttonequal.setFont(new Font("Arial",Font.PLAIN,25));
		buttonequal.setBackground(Color.black);
		buttonequal.setForeground(Color.orange);
		buttonequal.addActionListener(this);
		jf.add(buttonequal);
		
		buttonplus=new JButton("+");
		buttonplus.setBounds(191, 80, 50, 50);
		buttonplus.setFont(new Font("Arial",Font.PLAIN,25));
		buttonplus.setBackground(Color.black);
		buttonplus.setForeground(Color.orange);
		buttonplus.addActionListener(this);
		jf.add(buttonplus);
		
		buttonminus=new JButton("-");
		buttonminus.setBounds(191, 140, 50, 50);
		buttonminus.setFont(new Font("Arial",Font.PLAIN,25));
		buttonminus.setBackground(Color.black);
		buttonminus.setForeground(Color.orange);
		buttonminus.addActionListener(this);
		jf.add(buttonminus);
		
		buttonmul=new JButton("x");
		buttonmul.setBounds(191,200, 50, 50);
		buttonmul.setFont(new Font("Arial",Font.PLAIN,25));
		buttonmul.setBackground(Color.black);
		buttonmul.setForeground(Color.orange);
		buttonmul.addActionListener(this);
		jf.add(buttonmul);
		
		buttondiv=new JButton("/");
		buttondiv.setBounds(191, 261, 50, 50);
		buttondiv.setFont(new Font("Arial",Font.PLAIN,25));
		buttondiv.setBackground(Color.black);
		buttondiv.setForeground(Color.orange);
		buttondiv.addActionListener(this);
		jf.add(buttondiv);
		
		buttonclear=new JButton("Clear");
		buttonclear.setBounds(10, 321, 231, 50);
		buttonclear.setFont(new Font("Arial",Font.PLAIN,25));
		buttonclear.setBackground(Color.black);
		buttonclear.setForeground(Color.orange);
		buttonclear.addActionListener(this);
		jf.add(buttonclear);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String ar[]) {
		new Calculator();
		
	}
	@Override//to do buttonclick function
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			if(isOpertorClicked) {
				display.setText("1");
				isOpertorClicked=false;
			}else{
			 display.setText(display.getText()+"1");
			}
		} else if(e.getSource()==button2) {
			if(isOpertorClicked) {
				display.setText("2");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"2");
			}
		}else if(e.getSource()==button3) {
			if(isOpertorClicked) {
				display.setText("3");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"3");
			}
		}else if(e.getSource()==button4) {
			if(isOpertorClicked) {
				display.setText("4");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"4");
			}
		}else if(e.getSource()==button5) {
			if(isOpertorClicked) {
				display.setText("5");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"5");
			}
		}else if(e.getSource()==button6) {
			if(isOpertorClicked) {
				display.setText("6");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"6");
			}
		}else if(e.getSource()==button7) {
			if(isOpertorClicked) {
				display.setText("7");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"7");
			}
		}else if(e.getSource()==button8) {
			if(isOpertorClicked) {
				display.setText("8");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"8");
			}
		}else if(e.getSource()==button9) {
			if(isOpertorClicked) {
				display.setText("9");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"9");
			}
		}else if(e.getSource()==button0) {
			if(isOpertorClicked) {
				display.setText("0");
				isOpertorClicked=false;
			}else{
				display.setText(display.getText()+"0");
			}
		}
		
		else if(e.getSource()==buttonclear) {
			display.setText("");
		}else if(e.getSource()==buttonpoint) {
			display.setText(display.getText()+".");
		}
		else if(e.getSource()==buttonplus) {
			isOpertorClicked=true;
			operator=1;
			oldValue=display.getText();	
		}
		
		
		
		else if(e.getSource()==buttonminus) {
			isOpertorClicked=true;
			operator=2;
			oldValue=display.getText();
		}else if(e.getSource()==buttonmul) {
			isOpertorClicked=true;
			operator=3;
			oldValue=display.getText();
		}else if(e.getSource()==buttondiv) {
			isOpertorClicked=true;
			operator=4;
			oldValue=display.getText();
			
			
		}else if(e.getSource()==buttonequal) {
			if(isOpertorClicked=true) {
				switch(operator) {
				case 1:
					newValue=display.getText();
					float add1F=Float.parseFloat(oldValue);
					float add2F=Float.parseFloat(newValue);
					float result=add1F+add2F;
					display.setText(result+"");//+"" to make a number to string
					//so here the float result is changed to string
					break;
				case 2:
					newValue=display.getText();
					float minus1F=Float.parseFloat(oldValue);
					float minus2F=Float.parseFloat(newValue);
					result=minus1F-minus2F;
					display.setText(result+"");
				case 3:
					newValue=display.getText();
					float mul1F=Float.parseFloat(oldValue);
					float mul2F=Float.parseFloat(newValue);
					result=mul1F*mul2F;
					display.setText(result+"");
					break;
				case 4:
					newValue=display.getText();
					float div1F=Float.parseFloat(oldValue);
					float div2F=Float.parseFloat(newValue);
					result=div1F/div2F;
					display.setText(result+"");
					break;
				default:
					result=0;
					break;
					}
				}
			}
			
		}
}
