package git2;

import javax.swing.*;
public class calculo2 {

	public static void main(String args[]){
		float peso, altura, imc;
		String entrada = new String();
		
		entrada = JOptionPane.showInputDialog("Digite o peso");
		peso = Float.parseFloat(entrada);
		entrada = JOptionPane.showInputDialog("Digita a altura");
		altura = Float.parseFloat(entrada);
		imc = (peso)/(altura*altura);
		if (imc <=19){
			JOptionPane.showMessageDialog(null, "Abaixo do peso, muito magro " +imc);
		}
		if (imc >=20 && imc <=25){
			JOptionPane.showMessageDialog(null, "Peso Normal " +imc);
		}
		if (imc >=26 && imc <=30){
			JOptionPane.showMessageDialog(null, "Sobrepeso, um regiminho ajeita tudo " +imc);
		}
		if (imc >=31 && imc <=35){
			JOptionPane.showMessageDialog(null, "A coisa está ficando feia " +imc);
		}
		if (imc >=36 && imc <=40){
			JOptionPane.showMessageDialog(null, "Procure um SPA " +imc);
		}
		if (imc >=41){
			JOptionPane.showMessageDialog(null, "Procure um médico, sua saúde vai mal " +imc);
		}
	}
	}