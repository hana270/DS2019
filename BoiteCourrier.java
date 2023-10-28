package ds2019;

public class BoiteCourrier {
private int n;
 Courrier tab[];

	BoiteCourrier(int n){
		tab=new Courrier[n];
}
		
	public double affranchir() {
		double MT=0.0;
		for(int i=0;i<tab.length;i++) {
			MT+=tab[i].affranchir();
		}
		return MT;
	}
	public int courriersInvalides() {
		int s = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].estValide() == false) {
				s++;
			}
		}
		return s;
	}

@Override
public String toString() {
		
	return  " Le montant total ="+affranchir()+",Le nombre de courriers invalides =" +courriersInvalides();
}

	public void afficher() {
		for(int i=0;i<tab.length;i++) {
			if(tab[i].estValide()==true){
				System.out.print("***Valide : ");
				tab[i].decrire();
			}else if(tab[i].estValide()==false){
				System.out.print("***Invalide : ");
				tab[i].decrire() ;		
		}
		}
		System.out.println(toString());		
	}
	}
