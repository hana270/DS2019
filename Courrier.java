package ds2019;

public class Courrier {
protected boolean mode ;
protected String adr;
protected final double tarif=0.5;

public Courrier(boolean mode,String adr) {
	this.mode=mode;
	this.adr=adr;
}
public boolean estValide() {
	if(this.adr.length()==0) {
		return false;
	}else {
		return true;
	}
}
@Override
public String toString() {
	return this.getClass().getSimpleName()+" La mode d'expediteur :"+mode+", l'adresse ="+adr+" ,tarif ="+this.affranchir();
}
public void decrire() {
	System.out.println(toString());
}
public  double affranchir() {
	if(estValide()==true) {
		if(mode==true) {
			return tarif*2;
		}else {
			return tarif;
		}	
	}else {
		return 0.0;
	}
}		

}
