package org.java.animal;

 
public abstract class Animale {
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

    
    
    @Override
    public String toString() {
    	return getNome();
    }
	

	

}
