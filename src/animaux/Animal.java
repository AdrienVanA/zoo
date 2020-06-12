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
	
	String espece;
	Boolean sexe;
	String taille;
	int age;
	String faim;
	String sommeil;
	String sante;
	
	
	/*
	   manger (lorsqu’ils ne dorment pas) ;
	émettre un son ;
	 être soigné ;
	 s’endormir ou se réveille
	 */
	
	public Animal(String espece,String taille,Boolean sexe) {
		 this.espece=espece;
		 this.sexe=sexe;
		 this.taille=taille;
		 this.age=(int) (Math.random() * ((5 - 0) + 1));
		 this.faim=RandomSanteSommeilFaim("faim");
		 this.sommeil=RandomSanteSommeilFaim("sommeil");
		 this.sante=RandomSanteSommeilFaim("sante");	
	}
	
	public String ModeDeplacement() {
		
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
		String message="l'animal doit être éveillé pour cela";
		
		if(sommeil =="dort") {
			sommeil="eveille";
			message="l'animal est éveillé";

			}else {
				sommeil="dort";
				message="zzZZzz";
			}
		
		
		
		return message;
	}
	
	
	public String Soigner() {
		String message="l'animal doit être éveillé pour cela";
		
		if(sommeil =="dort") {
			sommeil="eveille";
			message="l'animal est éveillé";

			}else {
				sommeil="dort";
				message="zzZZzz";
			}
		
		
		
		return message;
	}
	
	
}
