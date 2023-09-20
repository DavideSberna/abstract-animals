package org.java.animal;

import org.java.animal.Main.INuotante;
 

public class Delfino extends Animale implements INuotante{
	
	public Delfino(String nome) {
		super(nome);
		 
	}
	 
	
	@Override
	public void verso() {
        System.out.println("Fischio del delfino!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia pesce.");
    }
 
	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");	
	}

	@Override
	public String toString() {		 
		return super.toString();
	}

	@Override
	public void carnivoro() {
		System.out.println("Carnivoro");	
	}

	 
}
