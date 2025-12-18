package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;


   public class DrawingView extends JPanel{
	   //drawingmodel model = new drawingModel(); ne moze kreriacemo dva modela moramo iskoristiti vec postojeci MODEL!!!
	   //jedini zadatak ove klase je crtanje svih oblika
	   
	   
	   
	   //izuzetak od MVC strukture:
	  DrawingModel model = new DrawingModel();

	  
	  public void paint(Graphics g)  //OSNOVNA METODA KOJA OMOGUCAVA DA SVE STO SE DODAJE U MODEL BUDE ISCRTANO!!!!!!!
	  {
		  Iterator<Shapes> it = model.getShapes().iterator();
		  while(it.hasNext())    //sve dok ima oblika crtaj ih
			  it.next().draw(g);
	  }

	public void setModel(DrawingModel model) {
		this.model = model;
	}
	   
	   
//sa ovim je okej izaci na odbranu. sve sto imam u pnl drawing i frm drawing iz jave treba da se izmjesti u frame i controller ( u kojem je logika ).
}
