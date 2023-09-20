package org.java.animal;

import org.java.animal.Main.INuotante;
 

public class Cane extends Animale implements INuotante{

	public Cane(String nome) {
		super(nome);
		
	}
	
	@Override
	public void verso() {
        System.out.println("Bau Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia carne.");
    }

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");	
	}

	
	
	@Override
	public String toString() {	 
		return super.toString();
	}

	
	
	
	
	
	 
}
