package ex07concurrency;

import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;

public class ProgressBar2 extends JPanel implements Runnable {
	int counter = 0;
	int end = 100;
	Thread t;
	JProgressBar pb;
	float r, g, b = 1;

	ProgressBar2() {
		this.setPreferredSize(new Dimension(400, 400));
		pb = new JProgressBar(1, 0, 100);
		add(pb);
		JFrame jf = new JFrame();
		jf.setContentPane(this);
		jf.pack();
		jf.setVisible(true);
		t = new Thread(this);
		t.start();
	}

	public void run() {
		pb.setForeground(new Color(r, g, b));
		pb.setValue(0);
		while (counter < end) {
			try {
				t.sleep(10);
				pb.setValue(counter);
				this.r = this.r + 0.01F;
				this.b = this.b - 0.01F;
				pb.setForeground(new Color(r, g, b));
				repaint();
			} catch (Exception e) {
			}
			counter += 1;
		}
		System.exit(0);
	}

	public static void main(String[] args) {
		ProgressBar2 pb2 = new ProgressBar2();
	}
}