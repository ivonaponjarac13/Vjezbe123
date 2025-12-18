package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		
		DrawingModel model = new DrawingModel(); //necemo ga praviti imamo u kontroleru
		Point p1 = new Point(10,10,Color.BLACK);
		
		
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		addPointCmd.execute();
		
		System.out.println(model.getShapes());
		
		addPointCmd.unexecute();
		System.out.println(model.getShapes());
		
		
		addPointCmd.execute();
		
		//testiramo brisanje
		RemovePointCmd removePointCmd = new RemovePointCmd(model, p1);
		
		removePointCmd.execute();
		
		
		removePointCmd.unexecute();
		
		
		//izmjena
		
		Point p2 = new Point(20,20,Color.BLACK);
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		
		
		updatePointCmd.execute();	
		System.out.println("nakon izmjene lista je:" + model.getShapes());
		
		updatePointCmd.unexecute();
		System.out.println("nakon ponistavanja izmjene lista je:" + model.getShapes());
		

	}

}
