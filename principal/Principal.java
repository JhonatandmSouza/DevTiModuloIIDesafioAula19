package principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Animal;
import classes.Cachorro;
import classes.Coelho;
import classes.Gato;
import classes.Rato;

public class Principal {

	public static void main(String[] args) {
		
		List<Animal> animal = new ArrayList<>();
		String opcao;
			
		do {
			
			opcao = JOptionPane.showInputDialog("Menu de opções para cadastrar animais:"
					+ "\n1 - Cachorro"
					+ "\n2 - Gato"
					+ "\n3 - Coelho"
					+ "\n4 - Rato"
					+ "\n5 - Exibir cadastro e sair");
				
				switch (opcao) {
				case "1":
					Cachorro cachorro = new Cachorro();
					animal.add(cachorro);
					break;
				case "2":
					Gato gato = new Gato();
					animal.add(gato);
					break;
				case "3":
					Coelho coelho = new Coelho();
					animal.add(coelho);
					break;
				case "4":
					Rato rato = new Rato();
					animal.add(rato);
					break;
				case "5":
					String exibir = "Cadastro de animais:\n\n";
					for (Animal a : animal) {
						exibir += a.exibirAlimento();
					}
					JOptionPane.showMessageDialog(null, exibir);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção incorreta!"
							+ "\nEscolha de 1 a 4 para cadastrar"
							+ "\nou 5 para sair.");
					break;
				}
			
		}while(!opcao.equals("5"));
	}
}
