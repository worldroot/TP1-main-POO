public abstract class Animal {

	private String nomAnimal;
	private TypeAnimal typeAnimal; 
	
	//TEST
	public Animal(String nomAnimal, TypeAnimal typeAnimal) {
		super();
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
	}
	
	public String getNomAnimal(){
		return nomAnimal;
	}
	public TypeAnimal getTypeAnimal(){
		return typeAnimal;
	}
}
