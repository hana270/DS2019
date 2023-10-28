package ds2019;

public class Colis extends Courrier{
	private int poids;
	private double volume;
	
public Colis(boolean mode,String adr,int poids,double volume) {
	super(mode,adr);
	this.poids=poids;
	this.volume=volume;
}

@Override
public String toString() {
	return super.toString()+" poids=" + poids + " grammes, volume=" + volume+" litres.";
}
public void decrire() {
	System.out.println(toString());
}

public double affranchir(){ 
	return 0.25*volume+(poids/1000)*1.0;
	
	}
		

}
