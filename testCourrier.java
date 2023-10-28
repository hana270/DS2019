package ds2019;

public class testCourrier {

	public static void main(String[] args) {

		BoiteCourrier b=new BoiteCourrier(4);
		b.tab[0]=new lettre(true,"nabeul",50,"A4");
		b.tab[1]=new Colis(false,"",90,25.0);
		b.tab[2]=new Courrier(false,"");
		b.tab[3]=new Colis(true,"sousse",60,12.0);
			
		//b.tab[0].decrire();
		//b.tab[1].decrire();
		//System.out.println(b.tab[0].estValide());	
		//System.out.println(b.tab[0].affranchir());	
		//System.out.println(b.tab[1].affranchir());
		System.out.println("Le Montant total d'affranchissement de tous les courriers = "+b.affranchir());
		System.out.println("*************************************Liste Courriers :************************************************");
		
		b.afficher();
		
		System.out.println("*************************************************************************************");
		System.out.println("Le nombre Des Courriers invalides est = "+b.courriersInvalides());
		
}
}
