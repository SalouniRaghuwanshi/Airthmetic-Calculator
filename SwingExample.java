import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SwingExample implements ActionListener
{
static float a=0,b=0;int ope=0;float r=0.0f;
JFrame f;
JPanel p;
JButton b1,b2,b3,b4,b5,b6,b7;
JLabel l1,l2,l3,l4,lblank1;
JTextField t1,t2,t3,t4;
public SwingExample()
{
f=new JFrame("Arithmetic Calculater Example in Swing");
p=new JPanel();
lblank1=new JLabel(" ");
l1=new JLabel("Enter The First Number:");
l2=new JLabel("Enter The Second Number:");
l3=new JLabel("Select Right Operator:");
l4=new JLabel("The Result Is:");
t1=new JTextField(15);
t2=new JTextField(15);
t3=new JTextField(15);
b1=new JButton("+");
b1.addActionListener(this);
b2=new JButton("-");
b2.addActionListener(this);
b3=new JButton("*");
b3.addActionListener(this);
b4=new JButton("/");
b4.addActionListener(this);
b5=new JButton("%");
b5.addActionListener(this);
b6=new JButton("COMPUTE");
b6.addActionListener(this);
b7=new JButton("EXIT");
b7.addActionListener(this);
p.setLayout(new GridLayout(8,2));
p.setBackground(Color.gray);
p.add(l1);p.add(t1);
p.add(l2);p.add(t2);
p.add(l4);p.add(t3);
p.add(l3);p.add(lblank1);
p.add(b1);p.add(b2);
p.add(b3);p.add(b4);
p.add(b5);p.add(b6);
p.add(b7);
f.add(p);
f.setSize(300,300);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
a=Float.parseFloat(t1.getText());
b=Float.parseFloat(t2.getText());
ope=1;}
if(ae.getSource()==b2)
{
a=Float.parseFloat(t1.getText());
b=Float.parseFloat(t2.getText());
ope=2;}
if(ae.getSource()==b3)
{
a=Float.parseFloat(t1.getText());
b=Float.parseFloat(t2.getText());
ope=3;}
if(ae.getSource()==b4)
{
a=Float.parseFloat(t1.getText());
b=Float.parseFloat(t2.getText());
ope=4;}
if(ae.getSource()==b5)
{
a=Float.parseFloat(t1.getText());
b=Float.parseFloat(t2.getText());
ope=5;}
if(ae.getSource()==b6)
{
if(ope==1)
r=a+b;
else if(ope==2)
r=a-b;
else if(ope==3)
r=a*b;
else if(ope==4)
r=a/b;
else if(ope==5)
r=a%b;
t3.setText(String.valueOf(r));
}
if(ae.getSource()==b7)
{
System.exit(0);
}
}
public static void main(String args[])
{new SwingExample();
}
}