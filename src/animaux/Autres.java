package animaux;

public class Autres extends Animal {

	public Autres(String espece, String taille) {
		super(espece, taille);
		
	}
	
	public Autres naissance(String tai) {
		System.out.println("Une "+espece+" Vient de pondre un enfant");
		Autres a= new Autres(this.espece,tai);
	return a;	
	}

}
