package Fr.Formation.test;
import Fr.Formation.test.LesFonction;
import Fr.Formation.test.tableau;

public class Principale {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Phrase = Fr.Formation.test.LesFonction.salut();
		int Calcul = Fr.Formation.test.LesFonction.calcul();
		Fr.Formation.test.tableau.Tableau();
		Fr.Formation.test.tableau.Dico();
		System.out.println(Phrase);
		System.out.println(Calcul);
	}
	
}
