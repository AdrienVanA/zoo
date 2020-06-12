package animaux;

public class Animal {

	/*
	 AVOIR
	 POLIMORPISME
	 HERITAGE
	 COLLECTION
	 DES PARENTS (Batman Out)
	 
	 fichier lisermoi avec explication,tuto,  etc
	 
	 tester l'appli, essayer de causer des erreurs/bugs
	 */
	
	
	/*
	  un nom (d'espèce) ;
  un sexe ;
  un poids ;
  une taille ;
  un âge ;
  un indicateur de faim ;
  un indicateur de sommeil (permettant de savoir s’il dort ou non) ;
  un indicateur de santé.

	 */
	
	protected String espece;
	protected Boolean sexe;
	protected String taille;
	protected int age;
	protected String faim;
	protected String sommeil;
	protected String sante;
	
	
	protected String deplacement;
	/*
	   manger (lorsqu’ils ne dorment pas) ;
	émettre un son ;
	 être soigné ;
	 s’endormir ou se réveille
	 */
	
	public Animal(String espece,String taille) {
		 this.espece=espece;
		 this.sexe=RandomSexe(); //TRUE = F && FALSE = H
		 this.taille=taille;
		 this.age=(int) (Math.random() * ((5 - 0) + 1));
		 this.faim=RandomSanteSommeilFaim("faim");
		 this.sommeil=RandomSanteSommeilFaim("sommeil");
		 this.sante=RandomSanteSommeilFaim("sante");	
	}
	
	public void setDeplacement(String a) {
		deplacement=a;	
	}
	
	
	public String RandomSanteSommeilFaim(String a) {
		String statu="Bon";
		double randomdonnees=(Math.random() * ((150 - 0) + 1));
		
		if(a=="faim") {
			if(randomdonnees <50) {
				statu="affamé";
			}
			if(randomdonnees >100) {
				statu="faim";
			}
		}
		if(a=="sommeil") {
			if(randomdonnees <50) {
				statu="dort";
			}
			if(randomdonnees >50) {
				statu="eveille";
			}	
		}
		if(a=="sante") {
			if(randomdonnees <75) {
				statu="malade";
			}

		}
		
		
		return statu;
	}
	
	public String manger() {
		String message="l'animal doit être éveillé pour cela";
		
		if(sommeil !="dort") {
			if(faim =="affamé") {
				message="l'animal n'est plus affamé, il a juste faim";
				faim ="faim";
			}else {
				faim ="bon";
				message="l'animal n'a plus faim";
			}
		}
		
		
		return message;
	}
	
	public String DormirEveiller() {
		String message="";
		
		if(sommeil =="dort") {
			sommeil="eveille";
			message="l'annimal est éveillé";

			}else {
				sommeil="dort";
				message="zzZZzz";
			}
		
		
		
		return message;
	}
	
	
	public String Soigner() {
		String message="l'animal est déjà en parfaite sante";
		
		if(sante =="malade") {
			sante="bon";
			message="l'animal a été soigné";

			}
	
		return message;
	}
	
	public boolean RandomSexe() {
		double randomdonnees=(Math.random() * ((100 - 0) + 1));
		if(randomdonnees>50) {
			return true;
		}
		return false;
	}
	
	
	public void ConnaitreSante() {
		if(sante =="malade") {
	System.out.println("Cet annimal est malade");

			}else
	System.out.println("Cet annimal est en bonne santé");
	}
	
	public void Connaitresommeil() {
		if(sommeil =="dort") {
	System.out.println("Cet annimal dort paisiblement");

			}else
	System.out.println("Cet annimal ne dort pas");
	}
	
	public void ConnaitreFaim() {
		if(faim =="affamé") {
	System.out.println("Cet annimal est affamé");

			}else if(faim=="faim") {
				System.out.println("Cet annimal a faim");			
			}else {
				System.out.println("Cet annimal est rassasié");
			}
	
	}
	
	
	public void ConnaitreSexe() {
		if(sexe) {
	System.out.println("Cet annimal est affamé");

			}else {
				System.out.println("Cet annimal est rassasié");
			}
	
	}	
	
	
	
	
	
	
}
