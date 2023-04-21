package view;

import controller.EscalonadorController;
import docarmo.FilaObject.Fila;
import model.Processo;

public class main {

	public static void main(String[] args) {
		
		Fila f = new Fila();
		EscalonadorController control = new EscalonadorController();	
		
		Processo p1 = new Processo();
		p1.Nome = "notepad.exe";
		p1.QtdRetornos = 14;
		
		Processo p2 = new Processo();
		p2.Nome = "\"C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE\"";
		p2.QtdRetornos = 18;
		
		Processo p3 = new Processo();
		p3.Nome = "write.exe";
		p3.QtdRetornos = 25;
		
		f.insert(p1);
		f.insert(p2);
		f.insert(p3);
		
		control.Escalonador(f);
		
	}

}
