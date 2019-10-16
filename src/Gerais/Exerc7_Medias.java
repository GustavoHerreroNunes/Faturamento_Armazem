package Gerais;

import javax.swing.JOptionPane;

public class Exerc7_Medias {

	public static void main(String[] args) {
		int Num[] = new int[10], p =0, i =0;
		double  MdP =0, MdI =0, MdG =0;
		
		for(int x =0; x<10; x++) {
			Num[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o " + (x+1) + "° valor:", "Medias", 3));
			
			if(Num[x]%2==0) {
				MdP += Num[x];
				p++;
			}
			else {
				MdI += Num[x];
				i++;
			}
			
			MdG += Num[x];
			
		}
		
		MdP /=p;
		MdI /=i;
		MdG /=10;
		
		JOptionPane.showMessageDialog(null, "A média dos pares é de : " + MdP + "\nA média dos ímpares é de : " + MdI + "\nA média total do grupo é de : " + MdG, "Medias", 1);
	}

}


