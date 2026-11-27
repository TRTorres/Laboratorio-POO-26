package pantalla;
import javax.swing.JFrame;

import Consultas.ConsultasBarrio;
import Consultas.ConsultasComuna;
import clasesPrincipales.Comuna;

public class App {

	public static void main(String[] args) {
		//dao daoo = new dao();
		JFrame marco = new JFrame();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setBounds(100,100,800,800);
		marco.setContentPane(new MenuPrincipal(marco));
		marco.validate();
		ConsultasComuna c = new ConsultasComuna();
		System.out.println(c.consultarNumeroDeComunaParaBarrio("Lugano"));
		ConsultasBarrio cc = new ConsultasBarrio();
		cc.cambiarNumeroComunaDeBarrios(8);
	}

}
