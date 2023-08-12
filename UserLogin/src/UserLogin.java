import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




import javax.swing.*;
import java.awt.event.*;
public class UserLogin extends JFrame implements ActionListener {

private static final long serialVersionUID = 1L;

JFrame frame = new JFrame();
Panel panel = new Panel();
Font font = new Font("Courier",Font.BOLD,15);

Button b1 = new Button("Sign up");
Button b2 = new Button("Sign in ");

JLabel l1 = new JLabel("Name: ");
JLabel l2 = new JLabel("Username: ");
JLabel l3 = new JLabel("Password: ");

JTextField Name = new JTextField();
JTextField Username = new JTextField();
JTextField password = new JTextField();


UserLogin() {

b1.setBounds(20, 40, 60, 60);
b1.setForeground(Color.RED);
b1.addActionListener(this);

b2.setBounds(20, 40, 60, 60);
b2.setForeground(Color.RED);
b2.addActionListener(this);

panel.setBounds(100, 100, 300, 200);
panel.setSize(300, 200);
panel.setLayout(new FlowLayout());
panel.add(b1);
panel.add(b2);
frame.add(panel);
frame.setSize(300, 200);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void actionPerformed(ActionEvent e) {
if(e.getSource() == b1) {
JFrame frame2 = new JFrame();
JPanel panel2 = new JPanel();
Button b3 = new Button("Sign up");

panel2.setBounds(50,100,300,100);
panel2.setSize(300, 100);
panel2.setLayout(new GridLayout(4,2));


l1.setForeground(Color.BLUE);
l1.setFont(font);
l2.setForeground(Color.BLUE);
l2.setFont(font);
l3.setForeground(Color.BLUE);
l3.setFont(font);
b3.setBounds(20, 40, 60, 60);
b3.setForeground(Color.BLUE);
b3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent l) {
if(l.getSource() == b3) {

String s1 = Name.getText();
String s2 = Username.getText();
String s3 = password.getText();


try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "1234");
	PreparedStatement ps = con.prepareStatement("insert into data1 values(?,?,?)");
	PreparedStatement pst = con.prepareStatement("select * from data1 where Username='" + s2 + "'");



ResultSet rs = pst.executeQuery();



int i = 0;



if (rs.next()) {



i++;



}



if (i < 1) {
ps.setString(1, s1);
ps.setString(2, s2);
ps.setString(3, s3.toString());
ps.executeUpdate();
JOptionPane.showMessageDialog(b1, "Username: "+s2+" have registered succesfully");

}



else if (i == 1) {



System.out.println(i + " Record Found");
JOptionPane.showMessageDialog(null, "Username: "+s2+ " already exists", "Error", JOptionPane.ERROR_MESSAGE);



} else {



System.out.println(i + " Records Found");
JOptionPane.showMessageDialog(null, "Username: "+s2+ " already exists", "Error", JOptionPane.ERROR_MESSAGE);



}



} catch (Exception ex) {



JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);



}
}
}
});

Name.setBounds(20, 20, 50, 50);
Username.setBounds(20, 20, 50, 50);
password.setBounds(20, 20, 50, 50);

panel2.add(l1);
panel2.add(Name);
panel2.add(l2);
panel2.add(Username);
panel2.add(l3);
panel2.add(password);
panel2.add(b3);
frame2.add(panel2);
frame2.setSize(300, 200);
frame2.setVisible(true);
frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

if(e.getSource() == b2) {
JFrame frame3 = new JFrame();
JPanel panel3 = new JPanel();
Button b4 = new Button("Sign in ");

panel3.setBounds(50,100,300,100);
panel3.setSize(300, 100);
panel3.setLayout(new GridLayout(4,2));

b4.setBounds(20, 40, 60, 60);
b4.setForeground(Color.BLUE);

b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent l) {
if(l.getSource() == b4) {

String s2 = Username.getText();

try
{
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "1234");

String sqlquery = "select * from data1 where Username = '"+s2+"'";
PreparedStatement pst = con.prepareStatement(sqlquery);



ResultSet rs = pst.executeQuery();



int i = 0;



if (rs.next()) {



i++;



}



if (i < 1) {



JOptionPane.showMessageDialog(null, "Invalid Username: "+s2+" and Invalid password", "Error", JOptionPane.ERROR_MESSAGE);



}



else if (i == 1) {



System.out.println(i + " Record Found");
JOptionPane.showMessageDialog(null, "Welcome: "+s2);



} else {



System.out.println(i + " Records Found");
JOptionPane.showMessageDialog(null, "Welcome: "+s2);
}



}
catch (Exception ex)
{
System.out.println(ex);
}
}
}
});

l2.setForeground(Color.BLUE);
l2.setFont(font);
l3.setForeground(Color.BLUE);
l3.setFont(font);

Username.setBounds(20, 20, 50, 50);
password.setBounds(20, 20, 50, 50);

panel3.add(l2);
panel3.add(Username);
panel3.add(l3);
panel3.add(password);
panel3.add(b4);
frame3.add(panel3);
frame3.setSize(300, 200);
frame3.setVisible(true);
frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}

public static void main(String [] args) {
new UserLogin();
}
}