package pantalla;
import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		//dao daoo = new dao();
		JFrame marco = new JFrame();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setBounds(100,100,800,800);
		marco.setContentPane(new MenuPrincipal(marco));
		marco.validate();
	}

}
