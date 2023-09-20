package org.java.animal;

public class Main {
	
	public static interface IVolante {
	    void vola();
	}

	
	public static interface INuotante {
	    void nuota();
	}

	public static void main(String[] args) {
		
		
		Animale[] animali = new Animale[4];
		animali[0] = new Cane("Cane");
		animali[1] = new Passerotto("Passerotto");
		animali[2] = new Aquila("Aquila");
		animali[3] = new Delfino("Delfino");
		
		
		
		for(int i = 0; i < animali.length; i++) {
			Animale animale = animali[i]; 
			
			System.out.print("Animale  -->  ");
			System.out.println(animale);
			System.out.print("Come dorme  -->  ");
			animale.dormi();
			System.out.print("Che verso fa  -->  ");
			animale.verso();
			System.out.print("Cosa mangia  -->  ");
			animale.mangia();
			
			System.out.print("Cosa può fare  -->  ");
			 if (animale instanceof INuotante) {
			        faiNuotare((INuotante) animale);
			    } else if (animale instanceof IVolante) {
			        faiVolare((IVolante) animale);
			    }
			System.out.println("\n---------------\n");
			 
		}
		

	}
	
	 
    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

     
    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

}
