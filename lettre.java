package ds2019;

public class lettre extends Courrier{
private int poids;
private String format;

public lettre(boolean mode,String adr,int poids,String format) {
	super(mode,adr);
	this.poids=poids;
	if(format.toUpperCase().equals("A3") || format.toUpperCase().equals("A4")) {
		this.format=format.toUpperCase();
	}else{
		System.out.println("Format invalide");
}
}

@Override
public String toString() {
	return super.toString()+" Son poids ="+poids+" grammes ,et sa format est :"+format;
}
public void decrire() {
	System.out.println(toString());
}

public double affranchir(){
	double montant=0.0;
	if(format=="A3") {
		montant= 3.50 +(0.5*poids/1000);
	}else if(format=="A4") {
		montant= 3.50+(0.5*poids/1000);
	}
	if(super.mode==true) {
		montant=montant*2;
	
	}
	return montant;
}

}
