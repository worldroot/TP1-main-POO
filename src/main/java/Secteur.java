import java.util.ArrayList;
import java.util.List;

public class Secteur implements Comparable<Object>{

	private List<Animal> animauxDansSecteur = new ArrayList<Animal>();
	private TypeAnimal typeAnimauxDansSecteur;
	
	public Secteur(TypeAnimal typeAnimauxDansSecteur) {
		super();
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}

	public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException{
		if (animal.getTypeAnimal() != typeAnimauxDansSecteur){
			throw new AnimalDansMauvaisSecteurException();
		}
		animauxDansSecteur.add(animal);
	}
	
	public int getNombreAnimaux(){
		return animauxDansSecteur.size();
	}
	
	public TypeAnimal obtenirType(){
		return typeAnimauxDansSecteur;
	}
	
	@Override
	public int compareTo(Object obj) {
		Secteur secteur2 =(Secteur) obj;
		if(this.getNombreAnimaux()>secteur2.getNombreAnimaux())
		{
			return 1;
		}
		else if(this.getNombreAnimaux()==secteur2.getNombreAnimaux())
		{
			return 0;
		}
		else
		{
			return 2; 
		}
	}
}
