package mvc;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shapes {
	
	private Point startPoint = new Point();
	private Point endPoint = new Point();
	private Color color;
	
	
    public Line() {
    }

	
	
	public Line(Point startPoint, Point endPoint, Color color) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.color = color;
	}



	public void draw(Graphics g) {
		
	}



	public Point getStartPoint() {
		return startPoint;
	}



	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}



	public Point getEndPoint() {
		return endPoint;
	}



	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
