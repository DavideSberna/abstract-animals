package org.java.animal;

 
import org.java.animal.Main.IVolante;

public class Aquila extends Animale implements IVolante{
	
	public Aquila(String nome) {
		super(nome);
		 
	}
	
	@Override
	public void verso() {
        System.out.println("Grido dell'aquila!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia piccoli animali.");
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
