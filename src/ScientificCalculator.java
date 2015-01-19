import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ScientificCalculator extends JFrame implements ActionListener {

        
		
		
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 10101010101010101L;
	
	int x,y,z,flag=0;
	Double result, temp, temp1;
	
	char c;
	JTextField txtfield;
	
	JButton	butt1= new JButton("1");
	JButton	butt2= new JButton("2");
	JButton	butt3= new JButton("3");
	JButton	butt4= new JButton("4");
	JButton	butt5= new JButton("5");
	JButton	butt6= new JButton("6");
	JButton	butt7= new JButton("7");
	JButton	butt8= new JButton("8");
	JButton	butt9= new JButton("9");
	JButton	butt10= new JButton("0");
	
	
	JButton	add= new JButton("+");
	JButton	sub= new JButton("-");
	JButton	div= new JButton("/");
	JButton	mul= new JButton("*");
	
	JButton dot = new JButton(".");
	JButton	clr= new JButton("C");
	JButton	eq= new JButton("=");	
		

public void ScientificCalulate()


{
	
	 JFrame frame= new JFrame("Scienific Calculator");
     txtfield= new JTextField(25);
     txtfield.setHorizontalAlignment(JTextField.RIGHT);
     JPanel panel= new JPanel();
     JPanel bpanel = new JPanel();
     bpanel.setLayout(new GridLayout(7,9,10,10));
     
     
		
       frame.setVisible(true);
	frame.setSize(290,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	frame.getContentPane().add(panel);
	txtfield.setPreferredSize(new Dimension (300, 50));
	
	
	
	butt1.addActionListener(this);
	butt2.addActionListener(this);
	butt3.addActionListener(this);
	butt4.addActionListener(this);
	butt5.addActionListener(this);
	butt6.addActionListener(this);
	butt7.addActionListener(this);
	butt8.addActionListener(this);
	butt9.addActionListener(this);
	butt10.addActionListener(this);
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	dot.addActionListener(this);
	eq.addActionListener(this);
	clr.addActionListener(this);
	
	
	
	
	bpanel.add(butt1);
	bpanel.add(butt2);
	bpanel.add(butt3);
	bpanel.add(butt4);
	bpanel.add(butt5);
	bpanel.add(butt6);
	bpanel.add(butt7);
	bpanel.add(butt8);
	bpanel.add(butt9);
	bpanel.add(butt10);
	bpanel.add(add);
	bpanel.add(sub);
	bpanel.add(mul);
	bpanel.add(div);
	
	bpanel.add(dot);
	bpanel.add(eq);
	bpanel.add(clr);
	
	
	panel.setLayout(new BorderLayout());
	panel.add(txtfield, BorderLayout.NORTH);
	panel.add(bpanel,BorderLayout.CENTER);
	
	
	
}




@Override
public void actionPerformed(final ActionEvent b) {
	 String s = b.getActionCommand();
	 if (s.equals("1")) {
		 if(flag==1){
			 flag=0;
			 txtfield.setText("");
		 }
		 
			 txtfield.setText(txtfield.getText() + "1");
		 
			 
		 }
	 
	 
if (s.equals("2")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
		 
			 txtfield.setText(txtfield.getText() + "2");
		 
			 
		 }

if (s.equals("3")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
		 txtfield.setText(txtfield.getText() + "3");
	
		 
	 }


if (s.equals("4")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
	 
		 txtfield.setText(txtfield.getText() + "4");
	  
		 
	 }

if (s.equals("5")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
	 
		 txtfield.setText(txtfield.getText() + "5");
	
		 
	 }

if (s.equals("6")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
	 
		 txtfield.setText(txtfield.getText() + "6");
	 
		 
	 	 
		 
	 }
if (s.equals("7")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
	
		 txtfield.setText(txtfield.getText() + "7");
	 
	 	 
		 
	 }

if (s.equals("8")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
	
		 txtfield.setText(txtfield.getText() + "8");
	 
		 
	 }

if (s.equals("9")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
	 
		 txtfield.setText(txtfield.getText() + "9");
	 
		 
	 }

if (s.equals("0")) {
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 }
	
		 txtfield.setText(txtfield.getText() + "0");
	  
		 
	 }
if(s.equals("+")){
	
	if(txtfield.getText().equals("")){
		txtfield.setText("");
		temp=0.0;
		c = '+';
		} else
		
		{ temp= Double.parseDouble(txtfield.getText());
		txtfield.setText("");
		c = '+';
		y=0;
		x=0;
		
		}
	txtfield.requestFocus();
	
}


if(s.equals("-")){
	 
	if(txtfield.getText().equals("")){
		txtfield.setText("");
		temp=0.0;
		c = '-';
		} else
		
		{ temp= Double.parseDouble(txtfield.getText());
		txtfield.setText("");
		c = '-';
		y=0;
		x=0;
		
		}
	txtfield.requestFocus();
	
	
	
}





if(s.equals("*")){
	
	
	
	if(txtfield.getText().equals("")){
		txtfield.setText("");
		temp=1.0;
		c = '*';
		} else
		
		{ temp= Double.parseDouble(txtfield.getText());
		txtfield.setText("");
		c = '*';
		y=0;
		x=0;
		
		}
	txtfield.requestFocus();
	
}			 		
			 		
if(s.equals("/")){ 
	
	if(txtfield.getText().equals("")){
		txtfield.setText("");
		temp=1.0;
		c = '/';
		} else
		
		{ temp= Double.parseDouble(txtfield.getText());
		txtfield.setText("");
		c = '/';
		y=0;
		x=0;
		
		}
	txtfield.requestFocus();
	
}	



if(s.equals(".")){
	
	 if(flag==1){
		 flag=0;
		 txtfield.setText("");
	 } if (y==0){
	
		 txtfield.setText(txtfield.getText() + ".");
	y=1;
	 
	 }else{
		 txtfield.setText(txtfield.getText());
	 }
	 
		 
}

	
	if(s.equals("=")){ 
		if(txtfield.getText().equals("")){
				txtfield.setText("");
		 }
		 else{
			 
			 temp1=Double.parseDouble(txtfield.getText());
			 switch (c){
			 
			 case '+':
				 
				 result=temp+temp1;
				 flag=1;
				 break;
				 
				 
              case '-':
				 
				 result=temp-temp1;
				 flag=1;
				 break;
				 
           case '*':
	 
	          result=temp*temp1;
	          flag=1;
	           break;
	 
					 
       case '/':
	 
	          result=temp/temp1;
	          flag=1;
	          break;
			 }
			 
			 
		txtfield.setText("");
		txtfield.setText(txtfield.getText() + result);
		z=1;
}
		 
	}		
	
	
if(s.equals("C"))
{
	
	txtfield.setText("");
	x=0;
	y=0;
	z=0;
	
}
}	
public static void main(final String[] args) {
	 ScientificCalculator a= new ScientificCalculator();
	a.ScientificCalulate();
	
}

	
	
	
}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

