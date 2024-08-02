package graphics;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ImageViewEx2 extends MFrame {
	Button b[] = new Button[4];
	String lab[] = { "첫번째", "두번째", "세번째", "랜덤" };
	Image img;
	String str[] = { "aaa0", "aaa1", "aaa2" };
	Random r = new Random();
	int i;

	public ImageViewEx2() {
		super(550, 300);
		Panel p = new Panel();
		p.setLayout(new GridLayout(4, 1));
		ButtonEvent be = new ButtonEvent();
		for (i = 0; i < b.length; i++) {
			p.add(b[i] = new Button(lab[i]));
			b[i].addActionListener(be);
		}
		
		add(p, BorderLayout.EAST);
	}

	class ButtonEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b[0]) {
				img = Toolkit.getDefaultToolkit().getImage("graphics/"+str[0]+".png");
				setTitle("graphics/"+str[0]+".png");
				repaint();
			}else if(e.getSource() == b[1]) {
				img = Toolkit.getDefaultToolkit().getImage("graphics/"+str[1]+".png");
				setTitle("graphics/"+str[1]+".png");
				repaint();
			}else if(e.getSource() == b[2]) {
				img = Toolkit.getDefaultToolkit().getImage("graphics/"+str[2]+".png");
				setTitle("graphics/"+str[2]+".png");
				repaint();
			}else {
				Random r = new Random();
				int rn = r.nextInt(3);
				System.out.println(rn);
				img = Toolkit.getDefaultToolkit().getImage("graphics/"+str[rn]+".png");
				setTitle("graphics/"+str[rn]+".png");
				repaint();
			}
		}
		
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println(img);
		g.drawImage(img, 0, 0, this);
		
	}
	
	public static void main(String[] args) {
		new ImageViewEx2();
	}

}
