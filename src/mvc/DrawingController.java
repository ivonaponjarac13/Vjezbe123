package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class DrawingController {
	
	DrawingModel model;
	DrawingFrame frame;
	
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	public void mouseClicked(MouseEvent e) {
		Point p1 = new Point(e.getX(), e.getY(), Color.BLACK); //ovdje dodjem iz frejma za crtanje na osnovu x i y koordinata.
		model.add(p1); //dodam tacku u model
		frame.repaint();
	}
	
	

}
