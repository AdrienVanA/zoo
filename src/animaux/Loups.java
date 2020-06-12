package animaux;

public class Loups  extends Mammiferes {

	public Loups( String taille) {
		super("loup", taille);
		// TODO Auto-generated constructor stub
	}

	
	public void emettreunson() {
		if(sexe) {
			System.out.println("La louve pousse un hurlement");	
		}else {
			System.out.println("Le loup pousse un hurlement");
		}
		
	}
	
	
	
	
}
