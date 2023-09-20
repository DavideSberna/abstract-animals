package org.java.animal;

import org.java.animal.Main.Carnivoro;

public abstract class Animale implements Carnivoro {
	private String nome;
	
	public Animale(	String nome) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public void dormi() {
        System.out.println("Zzz");
    }
	
	abstract void verso();
    abstract void mangia();

    
    public String toString() {
    	return getNome();
    }
	

	

}
