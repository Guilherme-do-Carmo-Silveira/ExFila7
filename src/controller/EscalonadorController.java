package controller;

import java.io.IOException;

import docarmo.FilaObject.Fila;
import model.Processo;

public class EscalonadorController {

	public EscalonadorController() {

	}

	public void Escalonador(Fila f) {

		int tempo = (int) (Math.random() * 4) + 1;
		while (!f.isEmpty()) {
			try {
				Processo p = (Processo) f.remove();
				if (p.QtdRetornos > 1) {
					p.QtdRetornos -= tempo;
					f.insert(p);
				} else {
					try {
						Runtime.getRuntime().exec(p.Nome);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
