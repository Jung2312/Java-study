package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx3 extends MFrame implements KeyListener {
	
	public KeyEventEx3() {
		super(500, 300, new Color(100, 200, 100));
		this.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Graphics g = getGraphics(); // ��
		g.setFont(new Font("Dialog", Font.BOLD, 20));
		g.setColor(Color.white);
		g.clearRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.red);
		
		g.setColor(Color.red);
		g.drawString("code �� : "+ e.getKeyCode(), 30, 80);
		g.drawString("���� �� : "+ e.getKeyChar(), 30, 100);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		Graphics g = getGraphics(); // ��
		g.setFont(new Font("Dialog", Font.BOLD, 20));
		
		g.setColor(Color.BLUE);
		g.drawString("code �� : "+ (int)e.getKeyCode(), 30, 150);
		g.drawString("���� �� : "+ e.getKeyChar(), 30, 180);
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	public static void main(String[] args) {
		new KeyEventEx3();
	}
}
