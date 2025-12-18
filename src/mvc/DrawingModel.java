package mvc;

import java.util.ArrayList;

public class DrawingModel {
	
	
	private ArrayList<Shapes> shapes = new ArrayList<Shapes>(); //iscrtano se dodaje u listu
	public void add(Shapes s) { //na mom projektu je ovo shape
		
		shapes.add(s);
		 
	 }
	
	public void remove(Shapes s) {
		shapes.remove(s);
	}
	
	public Shapes get(int index) {
		return shapes.get(index);
	}
	
	public ArrayList<Shapes> getShapes() {
		return shapes;
	}
	//ovaj model je ok za odbranu sluzi za listu... moze da se doda jos nesto u Model. 
	

}
