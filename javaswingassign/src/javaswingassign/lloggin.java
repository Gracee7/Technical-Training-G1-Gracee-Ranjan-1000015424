package javaswingassign;

import java.awt.Color; 

import java.awt.event.ActionEvent; 

import java.awt.event.ActionListener; 

import javax.swing.JButton; 

import javax.swing.JFrame; 

import javax.swing.JLabel; 

import javax.swing.JOptionPane; 

import javax.swing.JPasswordField; 

import javax.swing.JTextField; 

 

public class lloggin { 

 

JFrame f1, f2, f3; 

JLabel title, name, username, pass; 

JButton signup, signin, sup, sin; 

JTextField n, un, p; 

 

public lloggin() { 

f1 = new JFrame(); 

f1.getContentPane().setBackground(Color.white); 

 

f2 = new JFrame(); 

f2.getContentPane().setBackground(Color.white); 

 

f3 = new JFrame(); 

f3.getContentPane().setBackground(Color.white); 

 

name = new JLabel("Name:"); 

name.setBounds(10, 5, 150, 80); 

 

n = new JTextField(); 

n.setBounds(140, 40, 180, 20); 

 

username =new JLabel("Username:"); 

username.setBounds(10, 35, 150, 80); 

 

un = new JTextField(); 

    un.setBounds(140, 67, 180, 20); 

     

    pass = new JLabel("Password:"); 

pass.setBounds(10, 30, 150, 147); 

 

p = new JPasswordField(); 

p.setBounds(140, 94, 180, 20); 

 

sup = new JButton("Sign up"); 

sup.setBounds(225, 150, 95, 30); 

sup.addActionListener(new ActionListener() { 

 

public void actionPerformed(ActionEvent e) { 

 

String userName = un.getText(); 

        String password = p.getText(); 

        for(int i=0; i<10; i++) { 

if (userName.equals("admin")&&password.equals("admin")) { 

String s= " Already Exist"; 

s= userName.concat(s); 

    JOptionPane.showMessageDialog(null,s); 

} else { 

String s= " Already Exists "; //"Registered successfully

s = userName.concat(s); 

JOptionPane.showMessageDialog(null,s); 

} 

} 

} 

}); 

 

sin = new JButton("Sign in"); 

sin.setBounds(225, 150, 95, 30); 

sin.addActionListener(new ActionListener() { 

 

public void actionPerformed(ActionEvent e) { 

 

String userName = un.getText(); 

        String password = p.getText(); 

        for(int i=0; i<10; i++) { 

if (userName.equals("admin")&&password.equals("admin")) { 

String s= "Data Saved Successfully"; 

    JOptionPane.showMessageDialog(null,s); 

} else { 

String s= "Wrong Username or password"; 

    JOptionPane.showMessageDialog(null,s); 

} 

} 

} 

}); 

 

title = new JLabel("LOGIN FORM"); 

title.setBounds(120, 5, 150, 20); 

 

signup = new JButton("Sign up"); 

signup.setBounds(50, 130, 95, 30); 

signup.addActionListener(new ActionListener() { 

 

public void actionPerformed(ActionEvent e) { 

 

f2.add(name);f2.add(n);f2.add(username);f2.add(un);f2.add(pass);f2.add(p); 

f2.add(sup); 

f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

f2.setSize(400,400); 

f2.setLayout(null); 

f2.setVisible(true); 

} 

}); 

 

signin = new JButton("Sign in"); 

signin.setBounds(230, 130, 95, 30); 

signin.addActionListener(new ActionListener() { 

 

public void actionPerformed(ActionEvent e) { 

f3.add(username);f3.add(un);f3.add(pass);f3.add(p); 

f3.add(sin); 

f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

f3.setSize(400,400); 

f3.setLayout(null); 

f3.setVisible(true); 

} 

}); 

 

f1.add(title); 

f1.add(signin);f1.add(signup); 

f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

f1.setSize(400,400); 

f1.setLayout(null); 

f1.setVisible(true); 

} 

 

public static void main(String[] args) { 

new lloggin(); 

} 

} 