package org.java.animal;


import org.java.animal.Main.IVolante;

public class Passerotto extends Animale implements IVolante {

	public Passerotto(String nome) {
		super(nome);
		 
	}
	
	@Override
	public void verso() {
        System.out.println("Cip Cip!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia semi.");
    }

	

	
	 

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

	@Override
	public String toString() {
		 
		return super.toString();
	}
	 

}
