package mvc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingFrame extends JFrame{
	
	DrawingView view = new DrawingView();
	DrawingController controller;
	
	public DrawingFrame() {
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //kkao se iscrtava tacka? krenemo odavde ima neki mouse click i odem u controller
				controller.mouseClicked(e);
			}
		});
		
		//JPanel panel = new JPanel(); nije u redu da imamo dva panela, mi na objektnom imamo panel u frmDrawingu, a samo treba da ga zamjenimo
		getContentPane().add(view, BorderLayout.CENTER);
	}

	public DrawingView getView() {
		return view;
	}

	public void setController(DrawingController controller) {
		this.controller = controller;
	}
	
	
	
	
	

}
