import java.util.Comparator;

public class ComparaisonSecteur implements Comparator<Secteur> {

	@Override
	public int compare(Secteur secteur1, Secteur secteur2) {
		if(secteur1.getNombreAnimaux()>secteur2.getNombreAnimaux())
		{
			return 1;
		}
		else if(secteur1.getNombreAnimaux()==secteur2.getNombreAnimaux())
		{
			return 0;
		}
		else
		{
			return 2; 
		}
		
	}

}