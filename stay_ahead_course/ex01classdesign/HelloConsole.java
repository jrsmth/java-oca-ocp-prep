package ex01classdesign;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class HelloConsole extends JFrame {
	private JButton btnPress;
	private JButton btnExit;
	private JTextField txt;

    public HelloConsole() {
    	btnPress = new JButton("Don't press this");
    	btnExit = new JButton("Exit");
    	txt = new JTextField(30);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello World");
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        add(btnPress);
        add(txt);
        add(btnExit);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HelloConsole();
    }
}
