/* Este c�digo seria voltado para uma sistema de uma armazem com 100 produtos
 * e dever� receber a quantia de cada produto e o pre�o destes e calcular o 
 * faturamento mensal dessas vendas
 */

package Exercicios;

import javax.swing.JOptionPane;

public class Exer5 {

	public static void main(String[] args) {
		int Quant[] = new int[100];
		float Preco[] = new float[100], Fatu =0;
		
		for(int x =0; x<100; x++) {//Recebimento de valores e calculo do Fatoramento
			Quant[x]= Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade do " + (x+1) + "� produto", "ArmaColl", 3));
			Preco[x] = Float.parseFloat(JOptionPane.showInputDialog(null, "Agora o pre�o deste produto", "ArmaColl" ,3));
			
			Fatu += Quant[x] * Preco[x];//Calculo
		}
		
		JOptionPane.showMessageDialog(null, "Este � o faturamento deste m�s:\n" + "R$:" + Fatu, "ArmaColl", 1);

	}

}
