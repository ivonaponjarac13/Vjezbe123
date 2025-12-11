package mvc;

import java.util.ArrayList;

public class DrawingModel {
	
	
	private ArrayList<Point> shapes = new ArrayList<Point>(); //iscrtano se dodaje u listu
	public void add(Point p) { //na mom projektu je ovo shape
		
		shapes.add(p);
		 
	 }
	
	public void remove(Point p) {
		shapes.remove(p);
	}
	
	public Point get(int index) {
		return shapes.get(index);
	}
	
	public ArrayList<Point> getShapes() {
		return shapes;
	}
	//ovaj model je ok za odbranu sluzi za listu... moze da se doda jos nesto u Model. 
	

}
