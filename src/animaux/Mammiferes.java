package animaux;

public class Mammiferes extends Animal {

	public Mammiferes(String espece, String taille) {
		super(espece, taille);
		
	}
	
	public Mammiferes naissance(String tai) {
		System.out.println("Une "+espece+" Vient de mettre � bas un enfant");
		Mammiferes a= new Mammiferes(this.espece,tai);
	return a;	
	}

}
