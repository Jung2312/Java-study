package graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageViewEx1 extends MFrame {

	Image img;
	
	public ImageViewEx1() {
		super(550, 400);
		// 메모리에 로딩
		img = Toolkit.getDefaultToolkit().getImage("graphics/aaa.jpg");
	}
	
	// 컨테이너 객체가 생성되고 필요한 리소스(컴포넌트, 이미지 모두 포함) 그리는 메소드 -> 반복 호출
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
		
	}
	
	public static void main(String[] args) {
		new ImageViewEx1();
	}

}
